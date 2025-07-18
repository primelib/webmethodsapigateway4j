// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type QuiescemodeRequest struct {
	Payload *models.AdminQuiesceMode `bodyParam:""`
}

type QuiescemodeResponse struct {
	// Success response
	Result *models.AdminQuiesceMode
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// Quiescemode This method either enables or disables the quiesce mode in API Gateway. Quiesce mode has two kinds - designtime and all. Quiesce mode for designtime will block the designtime API requests to API Gateway server and return 503 status code except the GET http method as well as few whitelisted APIs like search and this API itself. Quiesce mode for all is an extension of Integration server's Quiesce mode with the addition of flushing of API Gateway in-memory data such as performance metrics, license metrics and subscription quota to the configured data store.
//
//meta:operation PUT /quiescemode
func Quiescemode(client *resty.Client, ctx context.Context, req QuiescemodeRequest) (*QuiescemodeResponse, error) {
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
	result := new(models.AdminQuiesceMode)
	r.SetResult(result)

	// send the request
	resp, err := r.Put("/quiescemode")
	if err != nil {
		return nil, err
	}

	return &QuiescemodeResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
