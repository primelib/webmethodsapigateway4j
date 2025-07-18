// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type FetchJnditemplatesRequest struct {
}

type FetchJnditemplatesResponse struct {
	// Success response
	Result *string
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// FetchJnditemplates The method retrieves list of all JNDI templates in API Gateway.
//
//meta:operation GET /is/jndi/template
func FetchJnditemplates(client *resty.Client, ctx context.Context, req FetchJnditemplatesRequest) (*FetchJnditemplatesResponse, error) {
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
	result := new(string)
	r.SetResult(result)

	// send the request
	resp, err := r.Get("/is/jndi/template")
	if err != nil {
		return nil, err
	}

	return &FetchJnditemplatesResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
