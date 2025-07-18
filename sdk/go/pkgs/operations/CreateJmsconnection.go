// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
	"github.com/primelib/webmethods-api-gateway-client/sdk/go/pkgs/models"
)

type CreateJmsconnectionRequest struct {
	Payload *models.AdminJmsconnectionAlias `bodyParam:""`
}

type CreateJmsconnectionResponse struct {
	// Success response
	Result *models.AdminJmsconnectionAlias
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// CreateJmsconnection The method creates a JMS connection in API Gateway. The API request body must contain the payload for the JMS connection
//
//meta:operation POST /is/jmsConnections
func CreateJmsconnection(client *resty.Client, ctx context.Context, req CreateJmsconnectionRequest) (*CreateJmsconnectionResponse, error) {
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
	result := new(models.AdminJmsconnectionAlias)
	r.SetResult(result)

	// send the request
	resp, err := r.Post("/is/jmsConnections")
	if err != nil {
		return nil, err
	}

	return &CreateJmsconnectionResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
