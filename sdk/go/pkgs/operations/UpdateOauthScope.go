// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type UpdateOauthScopeRequest struct {
	OauthScopeId *string                         `pathParam:"style=simple,explode=false,name=oauthScopeId"` // The path parameter specifies the id of an OAuth scope mapping that is to be updated in API Gateway.
	Payload      *models.ServiceMgmtGatewayScope `bodyParam:""`                                             // This parameter describes the request payload of an OAuth scope that is to be updated in API Gateway.
}

type UpdateOauthScopeResponse struct {
	// Success response
	Result *models.ServiceMgmtGatewayScope
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// UpdateOauthScope Use this method to update an OAuth scope mapping
//
//meta:operation PUT /scopes/{oauthScopeId}
func UpdateOauthScope(client *resty.Client, ctx context.Context, req UpdateOauthScopeRequest) (*UpdateOauthScopeResponse, error) {
	r := client.R().SetContext(ctx)

	// process request parameters
	reqData, err := requeststruct.ResolveRequestParams(req)
	if err != nil {
		return nil, err
	}
	r.SetHeader("Content-Type", "application/json")
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
	resp, err := r.Put("/scopes/{oauthScopeId}")
	if err != nil {
		return nil, err
	}

	return &UpdateOauthScopeResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
