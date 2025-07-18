// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type GetInstalledLanguagesRequest struct {
}

type GetInstalledLanguagesResponse struct {
	// Success response
	Result []*string
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetInstalledLanguages The method retrieves list of installed language packs in API Gateway.
//
//meta:operation GET /installedLanguages
func GetInstalledLanguages(client *resty.Client, ctx context.Context, req GetInstalledLanguagesRequest) (*GetInstalledLanguagesResponse, error) {
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
	var result []*string
	r.SetResult(result)

	// send the request
	resp, err := r.Get("/installedLanguages")
	if err != nil {
		return nil, err
	}

	return &GetInstalledLanguagesResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
