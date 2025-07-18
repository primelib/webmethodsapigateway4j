// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type GetHealthEngineV1Request struct {
}

type GetHealthEngineV1Response struct {
	// Success response
	Result *models.HealthCheckEngineResult
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetHealthEngineV1 Perform health check for core parts of API Gateway, such as Elasticsearch store, cluster environment and Integration Server health.
//
//meta:operation GET /health/engine
func GetHealthEngineV1(client *resty.Client, ctx context.Context, req GetHealthEngineV1Request) (*GetHealthEngineV1Response, error) {
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
	result := new(models.HealthCheckEngineResult)
	r.SetResult(result)

	// send the request
	resp, err := r.Get("/health/engine")
	if err != nil {
		return nil, err
	}

	return &GetHealthEngineV1Response{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
