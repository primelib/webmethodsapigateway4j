// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type SaveErrorProcessingDetailsRequest struct {
	Payload *models.AdminErrorProcessing `bodyParam:""`
}

type SaveErrorProcessingDetailsResponse struct {
	// Success response
	Result *models.AdminErrorProcessing
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// SaveErrorProcessingDetails This REST method is used to update the default error template with any custom templates and the value of the property - sendNativeProviderFault.
//
//meta:operation PUT /configurations/errorProcessing
func SaveErrorProcessingDetails(client *resty.Client, ctx context.Context, req SaveErrorProcessingDetailsRequest) (*SaveErrorProcessingDetailsResponse, error) {
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
	result := new(models.AdminErrorProcessing)
	r.SetResult(result)

	// send the request
	resp, err := r.Put("/configurations/errorProcessing")
	if err != nil {
		return nil, err
	}

	return &SaveErrorProcessingDetailsResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
