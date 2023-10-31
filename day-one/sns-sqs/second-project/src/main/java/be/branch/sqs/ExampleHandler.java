package be.branch.sqs;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SNSEvent;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClient;

public class ExampleHandler implements RequestHandler<SNSEvent, String> {

    private final AmazonSQS sqsClient = AmazonSQSClient.builder().build();
    private final String queue = System.getenv("QUEUE_URL");

    @Override
    public String handleRequest(SNSEvent snsEvent, Context context) {
        // retrieve the _message_ from the sns event
        // you can assume that SNSEvent will always contain _one_ record

        // and send a message to the queue

        return "OK";
    }
}
