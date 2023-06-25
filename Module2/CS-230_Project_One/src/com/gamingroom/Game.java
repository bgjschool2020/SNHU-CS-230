package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity {

	// removed the id and name variables because I saw no reason for them any longer
	private static List<Team> teams = new ArrayList<Team>();
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private Game() {
	}

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		this();
		this.id = id;
		this.name = name;
	}

	Team t;
	/**
	 * Adds a team object to the teams list, so long as there are no teams of the same name
	 * @param name the given name of a team
	 * @return team
	 */
	public Team addTeam(String name) {



		for (Team currentTeam : teams) {  // for each team in list of teams
			if (currentTeam.name.equals(name)) {  // if the current team name matches the name
				return currentTeam;  // if one matches, that team is returned, can't be having any duplicates!
			}
		}
		// there was no duplicate team name found, so create one
		GameService gServiceTeam = GameService.getGameService();  // GameService object to access getNextTeamId from
		t = new Team(gServiceTeam.getNextTeamId(), name);  // new Team object to be added to teams list

		// added to the end of the list
		teams.add(t);

		return t;
	}

	// removed the getId and getName methods because I saw no reason for them any longer

	@Override
	public String toString() {
		
		return "Game [id=" + id + ", name=" + name + ", teams=" + teams +"]";
	}
}
