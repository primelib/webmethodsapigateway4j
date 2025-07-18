// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type UpdateApiRequest struct {
	APIId         *string            `pathParam:"style=simple,explode=false,name=apiId"`          // API Id for the API to be updated
	OverwriteTags *bool              `queryParam:"style=simple,explode=false,name=overwriteTags"` // When an API is updated using a URL / file, the existing tags will be overwritten if this value is true.
	Payload       *models.UpdateAPIB `bodyParam:""`
}

type UpdateApiResponse struct {
	// Success response
	Result *models.ServiceMgmtAPIResponseCreate
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// UpdateApi This REST operation is used to update an API by importing a file, url or inline.  While updating the API, visibility of the operations can be set by enabling or disabling the operations. Disabled operations will not be exposed to the customers. By default, all the operations are exposed to the consumers.  When updating the API using file or url, API Gateway overwrite the resources/operations for the API. But it will retain the maturity state, scopes, visibility and if API mocking is enabled, then default mocked responses, mocked conditions and IS services will also be retained.
//
//meta:operation PUT /apis/{apiId}
func UpdateApi(client *resty.Client, ctx context.Context, req UpdateApiRequest) (*UpdateApiResponse, error) {
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
	result := new(models.ServiceMgmtAPIResponseCreate)
	r.SetResult(result)

	// send the request
	resp, err := r.Put("/apis/{apiId}")
	if err != nil {
		return nil, err
	}

	return &UpdateApiResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
