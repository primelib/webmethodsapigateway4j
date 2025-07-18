// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type DeleteWebserviceEndpointRequest struct {
	WebserviceEndpointId *string `pathParam:"style=simple,explode=false,name=webserviceEndpointId"` // This path parameter is used to specify the Webservice endpoint id for which Webservice endpoint needs to deleted.
}

type DeleteWebserviceEndpointResponse struct {
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// DeleteWebserviceEndpoint This delete request will delete the Webservice endpoint based on the Webservice endpoint id which is specified in path
//
//meta:operation DELETE /is/webServiceEndpoints/{webserviceEndpointId}
func DeleteWebserviceEndpoint(client *resty.Client, ctx context.Context, req DeleteWebserviceEndpointRequest) (*DeleteWebserviceEndpointResponse, error) {
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
	resp, err := r.Delete("/is/webServiceEndpoints/{webserviceEndpointId}")
	if err != nil {
		return nil, err
	}

	return &DeleteWebserviceEndpointResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
