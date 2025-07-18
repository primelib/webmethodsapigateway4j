// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type TrackJobStatusRequest struct {
	JobId *string `pathParam:"style=simple,explode=false,name=jobId"` // This parameter indicates the job Id. Job Id is required to identify and track the status of a job which has been initiated. Ex: jobId=1504011632215
}

type TrackJobStatusResponse struct {
	// Success response
	Result *string
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// TrackJobStatus Use this method to know the status of a specific job. This method returns the status and file name (in case of archive process) as a response. The user must either be a part of the API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
//
//meta:operation GET /apitransactions/jobs/{jobId}
func TrackJobStatus(client *resty.Client, ctx context.Context, req TrackJobStatusRequest) (*TrackJobStatusResponse, error) {
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
	result := new(string)
	r.SetResult(result)

	// send the request
	resp, err := r.Get("/apitransactions/jobs/{jobId}")
	if err != nil {
		return nil, err
	}

	return &TrackJobStatusResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
		Result:      result,
	}, nil
}
