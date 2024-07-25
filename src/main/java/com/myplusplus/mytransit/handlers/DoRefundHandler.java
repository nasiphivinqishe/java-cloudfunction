package com.myplusplus.mytransit.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class DoRefundHandler implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    private final Gson gson = new Gson();

    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent requestEvent, Context context) {
    APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
        try {
//            context.getLogger().log("Input: " + requestEvent.getBody());
//
//            // Parse JSON from request body
//            JsonObject jsonObject = gson.fromJson(requestEvent.getBody(), JsonObject.class);
//            String value = jsonObject.get("value").getAsString();

            String result = "Hello World - ";

            responseEvent.setStatusCode(200);
            responseEvent.setBody(result);
        } catch (Exception e) {
            context.getLogger().log("Error: " + e.getMessage());
            responseEvent.setStatusCode(500);
            responseEvent.setBody("Error processing input JSON");
        }
        return responseEvent;
    }
}
