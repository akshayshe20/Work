package com.bookmycon.bookmeeting.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class BookingIntentHandle  implements RequestHandler{
	 @Override
	    public boolean canHandle(HandlerInput input) {
	        return input.matches(intentName("BookingIntent"));
	    }

	    @Override
	    public Optional<Response> handle(HandlerInput input) {
	        String speechText = "you can make booking on alexa";
	       return input.getResponseBuilder()
	                .withSpeech(speechText)
	                .withSimpleCard("HelloWorld", speechText)
	                .build();
	    }
}
