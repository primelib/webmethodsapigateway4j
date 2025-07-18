// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type ChangeOwnerRequest struct {
	Payload *models.AdminChangeOwnerRequest `bodyParam:""`
}

type ChangeOwnerResponse struct {
	// Success response
	Result *models.AdminChangeOwnerResponse
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// ChangeOwner This resource is used to change the owner of APIGateway asset
//
//meta:operation POST /assets/owner
func ChangeOwner(client *resty.Client, ctx context.Context, req ChangeOwnerRequest) (*ChangeOwnerResponse, error) {
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
	result := new(models.AdminChangeOwnerResponse)
	r.SetResult(result)

	// send the request
	resp, err := r.Post("/assets/owner")
	if err != nil {
		return nil, err
	}

	return &ChangeOwnerResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
