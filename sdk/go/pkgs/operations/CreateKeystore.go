// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type CreateKeystoreRequest struct {
	Payload *models.CreateKeystoreB `bodyParam:""`
}

type CreateKeystoreResponse struct {
	// Success response
	Result *models.AdminKeyStore
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// CreateKeystore Creates a keystore in API Gateway.
//
//meta:operation POST /is/keystore
func CreateKeystore(client *resty.Client, ctx context.Context, req CreateKeystoreRequest) (*CreateKeystoreResponse, error) {
	r := client.R().SetContext(ctx)

	// process request parameters
	reqData, err := requeststruct.ResolveRequestParams(req)
	if err != nil {
		return nil, err
	}
	r.SetHeader("Content-Type", "multipart/form-data")
	r.SetHeader("Accept", "application/json")
	r.SetHeaders(reqData.HeaderParams)
	r.SetPathParams(reqData.PathParams)
	r.SetQueryParamsFromValues(reqData.QueryParams)
	if reqData.BodyParam != nil {
		r.SetBody(reqData.BodyParam)
	}
	result := new(models.AdminKeyStore)
	r.SetResult(result)

	// send the request
	resp, err := r.Post("/is/keystore")
	if err != nil {
		return nil, err
	}

	return &CreateKeystoreResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
