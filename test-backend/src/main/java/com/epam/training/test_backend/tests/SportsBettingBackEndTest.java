package com.epam.training.test_backend.tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.epam.training.test_backend.endpointactions.Events;
import com.epam.training.test_backend.endpointactions.Players;
import com.epam.training.test_backend.framework.BasicTest;
import com.epam.training.test_backend.model.Bet;
import com.epam.training.test_backend.model.Event;
import com.epam.training.test_backend.model.Player;

import io.restassured.response.Response;

public class SportsBettingBackEndTest extends BasicTest {

	@Test
	public void verifyUserRegistrationTest() throws JSONException {
		Response returnedPlayer = Players.getPlayerById(userId, sessionId);
		
		Player player = new Player.Builder(Integer.parseInt(userId))
				.withUserName(userName)
				.withName(TEST_NAME)
				.withAccountNumber(accountNumber)
				.withBalance(BALANCE)
				.withCurrency(HUF_CURRENCY)
				.build();
		
		
		JSONAssert.assertEquals(player.createJSONBodyWithNulls(), returnedPlayer.asString(), true);
	}
	
	@Test
	public void modifyUserTest() throws JSONException {
		Player player = new Player.Builder(Integer.parseInt(userId))
				.withUserName(userName)
				.withName("modifiedNameHere") // modified
				.withAccountNumber(accountNumber)
				.withBalance(42000) // modified
				.withCurrency(HUF_CURRENCY)
				.build();
		
		// update the player here!
		try {
			Players.getPlayerUpdate(player);
		} catch (Exception e) {
			System.out.println("nok");
		}
		
		Response returnedPlayer = Players.getPlayerById(userId, sessionId);

		// this is an application DB logic here
		player.setVersion(player.getVersion() + 1);
		
		JSONAssert.assertEquals(player.createJSONBodyWithNulls(), returnedPlayer.asString(), true);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void homeworkTest() {
		int actualNumberOfBets = 0;
		int actualNumberOfEvents = 0;
		List<Event> eventResultList;
		List<Bet> betResultList;
		
		// get the event and verify the number of them
		Response eventResponse  = Events.getEvents(sessionId);
		eventResultList = eventResponse.jsonPath().getObject("$", List.class);
		actualNumberOfEvents = eventResultList.size();
		assertEquals("There must be only one event!", 1, actualNumberOfEvents);
		
		String id = eventResponse.jsonPath().getString(ID);
		Response betResponse = Events.getBetsByEventId(id, sessionId);
		System.out.println(betResponse.asString());
	//	betResultList = betResponse.as(List.class);
		betResultList = betResponse.jsonPath().getObject("$", List.class);
		actualNumberOfBets = betResultList.size();

		assertEquals("There must be two bets!", 2, actualNumberOfBets);
	}
	
}
