package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity{

	// removed the id and name variables because I saw no reason for them any longer

	private static List<Player> players = new ArrayList<Player>();
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		this.id = id;
		this.name = name;
	}

	Player p = null;
	/**
	 * Adds a player object to the players list, so long as there are no players of the same name
	 * @param name the given name of a player
	 * @return player
	 */
	public Player addPlayer(String name) {



		for (Player currentPlayer : players) {  // for each player in list of players
			if (currentPlayer.name.equals(name)) {  // if the current player name matches the name
				return currentPlayer;  // if one matches, that player is returned, can't be having any duplicates!
			}
		}
		// there was no duplicate player name found, so create one
		GameService gServicePlayer = GameService.getGameService();  // GameService object to access getNextPlayerId from
		p = new Player(gServicePlayer.getNextPlayerId(), name);  // new Player object to be added to players list

		// added to the end of the list
		players.add(p);

		return p;
	}

	// removed the getId and getName methods because I saw no reason for them any longer

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", players=" + p + "]";
	}
}
