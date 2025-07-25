// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type GetOauthScopeRequest struct {
	OauthScopeId *string `pathParam:"style=simple,explode=false,name=oauthScopeId"` // The path parameter specifies the id of an OAuth scope mapping that is to be retrieved from API Gateway.
}

type GetOauthScopeResponse struct {
	// Success response
	Result *models.ServiceMgmtGatewayScope
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetOauthScope This method retrieves the requested OAuth scope mapping. OAuth scope mappings map the authorization server scope with APIs or API scopes
//
//meta:operation GET /scopes/{oauthScopeId}
func GetOauthScope(client *resty.Client, ctx context.Context, req GetOauthScopeRequest) (*GetOauthScopeResponse, error) {
	r := client.R().SetContext(ctx)

	// process request parameters
	reqData, err := requeststruct.ResolveRequestParams(req)
	if err != nil {
		return nil, err
	}
	r.SetHeader("Accept", "application/json")
	r.SetHeaders(reqData.HeaderParams)
	r.SetPathParams(reqData.PathParams)
	r.SetQueryParamsFromValues(reqData.QueryParams)
	if reqData.BodyParam != nil {
		r.SetBody(reqData.BodyParam)
	}
	result := new(models.ServiceMgmtGatewayScope)
	r.SetResult(result)

	// send the request
	resp, err := r.Get("/scopes/{oauthScopeId}")
	if err != nil {
		return nil, err
	}

	return &GetOauthScopeResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
