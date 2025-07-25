// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type GetUserRequest struct {
	UserId *string `pathParam:"style=simple,explode=false,name=userId"` // The path parameter specifies the id of an user whose details are to be retrieved.
}

type GetUserResponse struct {
	// Success response
	Result *models.UserMgmtUser
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// GetUser The method retrieves the details of an user in API Gateway.
//
//meta:operation GET /users/{userId}
func GetUser(client *resty.Client, ctx context.Context, req GetUserRequest) (*GetUserResponse, error) {
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
	result := new(models.UserMgmtUser)
	r.SetResult(result)

	// send the request
	resp, err := r.Get("/users/{userId}")
	if err != nil {
		return nil, err
	}

	return &GetUserResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
