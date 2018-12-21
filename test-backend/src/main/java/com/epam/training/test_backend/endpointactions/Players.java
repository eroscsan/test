package com.epam.training.test_backend.endpointactions;

import static io.restassured.RestAssured.given;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.training.test_backend.model.Player;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Players {
	
	private static final Logger logger = LogManager.getLogger("com.epam.training.test_backend.endpointactions.Players");
	
	private static final String PLAYERS_ENDPOINT = "players/{id}";
	private static final String UPDATE_PLAYER_ENDPOINT = "updatePlayer";
	
	public static Response getPlayerById(String id, String sessionId) {
		logger.info("GET {} {}", PLAYERS_ENDPOINT, id);
		return given().contentType(ContentType.JSON)
				.pathParam("id", id)
				.sessionId(sessionId)
				.get(PLAYERS_ENDPOINT)
				.then()
				.statusCode(200)
				.extract()
				.response();		
	}
	
	public static Response getPlayerUpdate(Player request) {
		logger.info("POST {} {}", UPDATE_PLAYER_ENDPOINT, request);
		return given().contentType(ContentType.JSON)
				.post(UPDATE_PLAYER_ENDPOINT)
				.then()
				.statusCode(302)
				.extract()
				.response();		
	}

}
