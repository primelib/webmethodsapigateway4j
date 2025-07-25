// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type GetPrimaryPortRequest struct {
}

type GetPrimaryPortResponse struct {
	// Success response
	Result *models.PortMgmtMessageWithPortReference
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetPrimaryPort The GET method retrieves the definition of the primary port.
//
//meta:operation GET /ports/primary
func GetPrimaryPort(client *resty.Client, ctx context.Context, req GetPrimaryPortRequest) (*GetPrimaryPortResponse, error) {
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
	result := new(models.PortMgmtMessageWithPortReference)
	r.SetResult(result)

	// send the request
	resp, err := r.Get("/ports/primary")
	if err != nil {
		return nil, err
	}

	return &GetPrimaryPortResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
