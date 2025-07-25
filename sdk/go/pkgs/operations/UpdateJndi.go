// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type UpdateJndiRequest struct {
	Payload *models.AdminJndiprovIDErAlias `bodyParam:""`
}

type UpdateJndiResponse struct {
	// Success response
	Result *models.AdminJndiprovIDErAlias
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// UpdateJndi This REST service is used to update the JNDI configuration
//
//meta:operation PUT /is/jndi
func UpdateJndi(client *resty.Client, ctx context.Context, req UpdateJndiRequest) (*UpdateJndiResponse, error) {
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
	result := new(models.AdminJndiprovIDErAlias)
	r.SetResult(result)

	// send the request
	resp, err := r.Put("/is/jndi")
	if err != nil {
		return nil, err
	}

	return &UpdateJndiResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
