// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type APITransactionsArchiveBasedOnDurationRequest struct {
	From      *string `queryParam:"style=simple,explode=false,name=from"`      // This is a date parameter. All the api transactions of specified type, from the given date, are archived. Ex: from=2017-12-18 00:00:00. Either one of from or duration is a mandatory parameter
	Until     *string `queryParam:"style=simple,explode=false,name=until"`     // This is a date parameter. All the api transactions of specified type, until the given date, are archived. Ex: until=2017-12-18 00:00:00. Either one of until or duration is a mandatory parameter
	OlderThan *string `queryParam:"style=simple,explode=false,name=olderThan"` // All the api transactions of specified type that are older than the value specified are archived. Ex: olderThan='2d'. Possible types are d(days),M(months),y(years), For Example a) 2d means 2days b) 1M means 1 month c) 1y means 1 year
	EventType *string `queryParam:"style=simple,explode=false,name=eventType"` // This parameter is used to specify the api transaction type.Specify eventType=ALL to archive all the events. To archive a specific event type, specify the required event type. Ex: eventType=transactionalEvents. The available event types are as follows 1.transactionalEvents 2.monitorEvents 3.errorEvents 4.performanceMetrics 5.threatProtectionEvents 6.lifecycleEvents 7.policyViolationEvents 8.auditlogs 9.applicationlogs 10.mediatorTraceSpan 11.serverLogTraceSpan
}

type APITransactionsArchiveBasedOnDurationResponse struct {
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// APITransactionsArchiveBasedOnDuration This method is used to archive the runtime events and metrics. Data to be archived is filtered based on the input parameters. This method returns the job id as the response which is used to know the job status.   Use GET /apitransactions/jobs/{jobId} method to know the status and file name, use POST /apitransactions/archives/{fileName} method to restore. The user must either be a part of the API-Gateway-Administrators group or must have the 'Manage purge and restore runtime events' privilege to perform this operation.
//
//meta:operation POST /apitransactions/archives
func APITransactionsArchiveBasedOnDuration(client *resty.Client, ctx context.Context, req APITransactionsArchiveBasedOnDurationRequest) (*APITransactionsArchiveBasedOnDurationResponse, error) {
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
	resp, err := r.Post("/apitransactions/archives")
	if err != nil {
		return nil, err
	}

	return &APITransactionsArchiveBasedOnDurationResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
