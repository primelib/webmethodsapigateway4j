// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type UpdateAPIPortalConfigurationRequest struct {
	PortalGatewayId *string                    `pathParam:"style=simple,explode=false,name=portalGatewayId"` // Id of the API Portal configuration for update
	Payload         *models.AdminPortalGateway `bodyParam:""`                                                // API Portal configuration payload
}

type UpdateAPIPortalConfigurationResponse struct {
	// Success response
	Result *models.AdminPortalGateway
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// UpdateAPIPortalConfiguration This API allows you to update API Portal configuration information in API Gateway.
//
//meta:operation PUT /portalGateways/{portalGatewayId}
func UpdateAPIPortalConfiguration(client *resty.Client, ctx context.Context, req UpdateAPIPortalConfigurationRequest) (*UpdateAPIPortalConfigurationResponse, error) {
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
	resp, err := r.Put("/portalGateways/{portalGatewayId}")
	if err != nil {
		return nil, err
	}

	return &UpdateAPIPortalConfigurationResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
