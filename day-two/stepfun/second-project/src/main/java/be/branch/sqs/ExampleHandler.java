package be.branch.sqs;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

record Input() {} // add the right input
record Output() {} // output is optional, add something if you want

public class ExampleHandler implements RequestHandler<Input, Output> {

    // set up your client and find the right url

    @Override
    public Output handleRequest(Input input, Context context) {
        // send a message to SQS
        return new Output();
    }
}
