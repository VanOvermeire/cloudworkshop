package be.branch.sns;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;
import com.amazonaws.services.dynamodbv2.model.GetItemResult;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

public class ExampleHandler implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    private final AmazonDynamoDB db = AmazonDynamoDBClientBuilder.defaultClient();
    private final String tableName = System.getenv("DATABASE");

    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent apiGatewayProxyRequestEvent, Context context) {
        // get name from the query params
        // create GetItemRequest with table name and the right key
        GetItemRequest getItemRequest = null;
        GetItemResult item = db.getItem(getItemRequest);
        // and return what you found
        return new APIGatewayProxyResponseEvent().withStatusCode(200).withBody(item.toString());
    }
}
