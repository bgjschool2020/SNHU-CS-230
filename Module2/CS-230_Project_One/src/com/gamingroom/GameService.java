package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu, Bryce Jensen
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	private static long nextTeamId = 1;
	private static long nextPlayerId = 1;


	// A singleton pattern is used here to ensure that only one instance of the GameService class exists at a time. This is done to keep memory clean and at minimal space.

	// the only GameService allowed is set to NULL;
	private static GameService gService = null;

	// by making constructor private, only one instance of the GameService can be created.
	private GameService() {

	}
	/**
	 * creates a new GameService object and returns it
	 * @return gService - GameService object
	 */
	public static GameService getGameService() {
		if (gService == null) {
			gService = new GameService();
		}
		return gService;
	}


	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with same name
		// if found, simply return the existing instance
		// an iterator is used to go through each instance of the game. This is done so that there are no duplicate game names, preventing problems like duplicate instances of a game when saving. All this does is ensure that the name chosen is not already being used somewhere else.


		// if not found, make a new game instance and add to list of games
		if (getGame(name) != null) {  //
			game = getGame(name);
		}
		else {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable
		for (Game currentGame : games) {  // for each game in list of games
			if (currentGame.getId() == id) {  // if the current game matches the id
				game = currentGame;  // assign game with the current game
				break;
			}
		}
		return game;  // return game
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with same name
		// if found, simply assign that instance to the local variable
		for (Game currentGame : games) {  // for each game in list of games
			if (currentGame.getName().equals(name)) {  // if the current game matches the name
				game = currentGame;  // assign game with the current game
				break;
			}
		}

		return game;  // return game
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}

	public long getNextTeamId() {
		return nextTeamId++;
	}

	public long getNextPlayerId() {
		return nextPlayerId++;
	}
}
