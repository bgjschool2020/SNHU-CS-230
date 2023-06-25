package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// obtain reference to the singleton instance
		GameService service = GameService.getGameService();
		
		System.out.println("\nAbout to test initializing game data...");
		
		// initialize with some game data
		Game game1 = service.addGame("Game #1");
		Game game2 = service.addGame("Game #2");

		// Team data
		game1.addTeam("Team 1");
		game1.addTeam("Team 2");

		// Player data
		game1.addTeam("Team 1").addPlayer("Franklin");
		game1.addTeam("Team 1").addPlayer("Beebop");

		// Print game data
		System.out.println(game1);
		System.out.println(game2);


		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
	}
}
