// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type GetTruststoreRequest struct {
	TrustStoreName *string `pathParam:"style=simple,explode=false,name=trustStoreName"` // Truststore name to identify the corresponding trust store in API Gateway
}

type GetTruststoreResponse struct {
	// Success response
	Result []*models.AdminTrustStore
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetTruststore Retrieves an existing truststore matching the given name from API Gateway.
//
//meta:operation GET /is/truststore/{trustStoreName}
func GetTruststore(client *resty.Client, ctx context.Context, req GetTruststoreRequest) (*GetTruststoreResponse, error) {
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
	var result []*models.AdminTrustStore
	r.SetResult(result)

	// send the request
	resp, err := r.Get("/is/truststore/{trustStoreName}")
	if err != nil {
		return nil, err
	}

	return &GetTruststoreResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
