// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type UnpublishApiRequest struct {
	APIId *string `pathParam:"style=simple,explode=false,name=apiId"` // API Id for the API to be unpublished
}

type UnpublishApiResponse struct {
	// Success response
	Result *models.ServiceMgmtAPIResponseCreate
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// UnpublishApi Unpublish API from the registered API Portal
//
//meta:operation PUT /apis/{apiId}/unpublish
func UnpublishApi(client *resty.Client, ctx context.Context, req UnpublishApiRequest) (*UnpublishApiResponse, error) {
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
	result := new(models.ServiceMgmtAPIResponseCreate)
	r.SetResult(result)

	// send the request
	resp, err := r.Put("/apis/{apiId}/unpublish")
	if err != nil {
		return nil, err
	}

	return &UnpublishApiResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
