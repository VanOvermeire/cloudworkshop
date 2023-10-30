package be.branch.sns;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.amazonaws.services.sns.AmazonSNS;

public class ExampleHandler implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    private final AmazonSNS snsClient = null; // create the sns client
    private final String topic = null; // retrieve the topic ARN from the env variables

    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent apiGatewayProxyRequestEvent, Context context) {
        String name = apiGatewayProxyRequestEvent.getQueryStringParameters().get("name");
        // publish a message
        return new APIGatewayProxyResponseEvent().withStatusCode(200).withBody("OK");
    }
}
