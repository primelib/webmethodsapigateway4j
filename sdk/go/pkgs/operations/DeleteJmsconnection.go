// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type DeleteJmsconnectionRequest struct {
	JmsConnId *string `pathParam:"style=simple,explode=false,name=jmsConnId"` // This path parameter is used to specify the JMS connection id for which JMS connection needs to deleted.
}

type DeleteJmsconnectionResponse struct {
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// DeleteJmsconnection This delete request will delete the JMS connection based on the JMS connection id which is specified in path
//
//meta:operation DELETE /is/jmsConnections/{jmsConnId}
func DeleteJmsconnection(client *resty.Client, ctx context.Context, req DeleteJmsconnectionRequest) (*DeleteJmsconnectionResponse, error) {
	r := client.R().SetContext(ctx)

	// process request parameters
	reqData, err := requeststruct.ResolveRequestParams(req)
	if err != nil {
		return nil, err
	}
	r.SetHeaders(reqData.HeaderParams)
	r.SetPathParams(reqData.PathParams)
	r.SetQueryParamsFromValues(reqData.QueryParams)
	if reqData.BodyParam != nil {
		r.SetBody(reqData.BodyParam)
	}

	// send the request
	resp, err := r.Delete("/is/jmsConnections/{jmsConnId}")
	if err != nil {
		return nil, err
	}

	return &DeleteJmsconnectionResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
