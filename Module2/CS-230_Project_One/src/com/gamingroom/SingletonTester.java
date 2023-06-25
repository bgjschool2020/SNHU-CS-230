package com.gamingroom;

/**
 * A class to test a singleton's behavior
 * 
 * @author coce@snhu.edu
 */
public class SingletonTester {

	public void testSingleton() {
		
		System.out.println("\nAbout to test the singleton...");
		
		// obtain local reference to the singleton instance
		GameService gService = GameService.getGameService(); // replace null with GameService.getGameService()
		
		// a simple for loop to print the games
		for (int i = 0; i < gService.getGameCount(); i++) {
			System.out.println(gService.getGame(i));
		}

	}
	
}
