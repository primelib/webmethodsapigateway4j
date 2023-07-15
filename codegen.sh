#!/bin/bash

# setup
PROJECT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

# test
case $1 in
  "update")
    echo "> updating openapi spec" # source: https://github.com/SoftwareAG/webmethods-api-gateway/tree/master/apigatewayservices
    mkdir -p "$PROJECT_DIR/spec"
    curl -o "$PROJECT_DIR/spec/openapi.admin.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayAdministration.json
    curl -o "$PROJECT_DIR/spec/openapi.alias.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayAlias.json
    curl -o "$PROJECT_DIR/spec/openapi.application.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayApplication.json
    curl -o "$PROJECT_DIR/spec/openapi.approval.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayApprovalManagement.json
    curl -o "$PROJECT_DIR/spec/openapi.archive.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayArchive.json
    curl -o "$PROJECT_DIR/spec/openapi.availability.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayAvailability.json
    curl -o "$PROJECT_DIR/spec/openapi.data.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayDataManagement.json
    curl -o "$PROJECT_DIR/spec/openapi.document.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayDocumentManagement.json
    curl -o "$PROJECT_DIR/spec/openapi.internal.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayInternalService.json
    curl -o "$PROJECT_DIR/spec/openapi.monetization.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayMonetizationSwagger.json
    curl -o "$PROJECT_DIR/spec/openapi.policy.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayPolicyManagement.json
    curl -o "$PROJECT_DIR/spec/openapi.port.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayPortManagement.json
    curl -o "$PROJECT_DIR/spec/openapi.promotion.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayPromotionManagement.json
    curl -o "$PROJECT_DIR/spec/openapi.public.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayPublicServices.json
    curl -o "$PROJECT_DIR/spec/openapi.search.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewaySearch.json
    curl -o "$PROJECT_DIR/spec/openapi.server.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayServerInfoSwagger.json
    curl -o "$PROJECT_DIR/spec/openapi.service.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayServiceManagement.json
    curl -o "$PROJECT_DIR/spec/openapi.transactional.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayTransactionalEvent.json
    curl -o "$PROJECT_DIR/spec/openapi.user.json" https://raw.githubusercontent.com/SoftwareAG/webmethods-api-gateway/master/apigatewayservices/APIGatewayUserManagementSwagger.json
    SPEC_FILE="$PROJECT_DIR/openapi.json"
    jq -s '.[0] * .[1]' "$PROJECT_DIR"/spec/*.json > "$SPEC_FILE"
    jq '.info.title="API Gateway"' "$SPEC_FILE" | sponge "$SPEC_FILE" # overwrite name
    jq '.info.description="webMethods API Gateway is the core run time component in webMethods API Management platform and it enables organizations to secure, manage and monitor their API programs."' "$SPEC_FILE" | sponge "$SPEC_FILE" # overwrite description
    jq 'del(.definitions.BasicAuth, .definitions.ClientCredentialsAuth, .definitions.NoAuth, .definitions.RefreshTokenAuth, .definitions.TokenAuth)' "$SPEC_FILE" | sponge "$SPEC_FILE"
    ;;

  "generate")
    echo "> running code generation"
    docker run -it --rm -v $(pwd):/project ghcr.io/primelib/primecodegen:0.0.1 \
      primecodegen generate \
      -e auto \
      -i "/project/openapi.json" \
      -o "/project" \
      -c "/project/openapi-generator.json" \
      --openapi-normalizer SIMPLIFY_ONEOF_ANYOF=true \
      --openapi-normalizer SIMPLIFY_BOOLEAN_ENUM=true \
      --openapi-normalizer REMOVE_ANYOF_ONEOF_AND_KEEP_PROPERTIES_ONLY=true \
      --openapi-normalizer REFACTOR_ALLOF_WITH_PROPERTIES_ONLY=true
    ;;
esac
