// WARNING: This file was generated by PrimeCodeGen. DO NOT EDIT.

package operations

import (
	"context"
	"net/http"

	"github.com/go-resty/resty/v2"
	"github.com/primelib/primecodegen-lib-go/requeststruct"
)

type DeleteRuleRequest struct {
	RuleId *string `pathParam:"style=simple,explode=false,name=ruleId"` // The path parameter specifies the id of a rule that is to be deleted from API Gateway.
}

type DeleteRuleResponse struct {
	// Error response
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

// DeleteRule The method deletes a rule from API Gateway.
//
//meta:operation DELETE /rule/{ruleId}
func DeleteRule(client *resty.Client, ctx context.Context, req DeleteRuleRequest) (*DeleteRuleResponse, error) {
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
	resp, err := r.Delete("/rule/{ruleId}")
	if err != nil {
		return nil, err
	}

	return &DeleteRuleResponse{
		StatusCode:  resp.StatusCode(),
		RawResponse: resp.RawResponse,
	}, nil
}
