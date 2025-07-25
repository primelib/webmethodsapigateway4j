// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type SaveLogConfigRequest struct {
}

type SaveLogConfigResponse struct {
	// Success response
	Result *models.AdminLogConfiguration
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// SaveLogConfig The method is used to update the details of the log configuration in API Gateway.
//
//meta:operation PUT /configurations/logConfig
func SaveLogConfig(client *resty.Client, ctx context.Context, req SaveLogConfigRequest) (*SaveLogConfigResponse, error) {
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
	result := new(models.AdminLogConfiguration)
	r.SetResult(result)

	// send the request
	resp, err := r.Put("/configurations/logConfig")
	if err != nil {
		return nil, err
	}

	return &SaveLogConfigResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
