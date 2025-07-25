// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type CreateAPIPortalConfigurationRequest struct {
	Payload *models.AdminPortalGateway `bodyParam:""` // API Portal configuration payload
}

type CreateAPIPortalConfigurationResponse struct {
	// Success response
	Result *models.AdminPortalGateway
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// CreateAPIPortalConfiguration This method allows you to create the API Portal configuration in API Gateway.
//
//meta:operation POST /portalGateways
func CreateAPIPortalConfiguration(client *resty.Client, ctx context.Context, req CreateAPIPortalConfigurationRequest) (*CreateAPIPortalConfigurationResponse, error) {
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
	result := new(models.AdminPortalGateway)
	r.SetResult(result)

	// send the request
	resp, err := r.Post("/portalGateways")
	if err != nil {
		return nil, err
	}

	return &CreateAPIPortalConfigurationResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
