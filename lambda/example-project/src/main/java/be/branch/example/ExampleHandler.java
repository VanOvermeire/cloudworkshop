package be.branch.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

// for Java, your entry point should implement RequestHandler
// input type can be Map, List, or custom types that AWS has created
// OR you can create your own class / record
// JSON serialization and deserialization is handled by AWS
public class ExampleHandler implements RequestHandler<Map<String, String>, String>{

    @Override
    public String handleRequest(Map<String, String> event, Context context) {
        System.out.println(event);
        return "hello";
    }
}
