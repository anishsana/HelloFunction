package lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<String, String> {

	@Override
	public String handleRequest(String input, Context context) {
		String output = "";
		if (input.isEmpty()) {
			output = "No input provided";

		} else {
			output = "Hello, " + input + "! Checking invocation - 1";
		}
		return output;
	}

}
