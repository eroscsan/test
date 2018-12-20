package com.epam.training.test_backend.endpointactions;

import static io.restassured.RestAssured.given;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Events {
	
	private static final Logger logger = LogManager.getLogger("com.epam.training.test_backend.endpointactions.Events");
	
	private static final String LOAD_EVENTS_ENDPOINT = "loadEvents";
	private static final String LOAD_BETS_ENDPOINT = "loadBets";
	
	public static Response getEvents(String sessionId) {
		logger.info("GET {}", LOAD_EVENTS_ENDPOINT);
		//here comes the restAssured solution to get events
		return given().contentType(ContentType.JSON)
				.sessionId(sessionId)
				.get(LOAD_EVENTS_ENDPOINT)
				.then()
				.statusCode(200)
				.extract()
				.response();	
	}
	
	public static Response getBetsByEventId(String eventId, String sessionId) {
		logger.info("GET {} {}", LOAD_BETS_ENDPOINT, eventId);
		//here comes the restAssured solution to get bets
		return given().contentType(ContentType.JSON)
				//.pathParam("eventId", eventId)
				.sessionId(sessionId)
				.get(LOAD_BETS_ENDPOINT)
				.then()
				.statusCode(200)
				.extract()
				.response();	 
	}
}
