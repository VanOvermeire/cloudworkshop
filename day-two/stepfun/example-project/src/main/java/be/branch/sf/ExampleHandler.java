package be.branch.sf;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

record Input() {} // add the right input
record Output() {} // add the right output

public class ExampleHandler implements RequestHandler<Input, Output> {
    @Override
    public Output handleRequest(Input input, Context context) {
        return null; // transform the input
    }
}
