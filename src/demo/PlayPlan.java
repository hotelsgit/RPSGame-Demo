package demo;

import java.util.Random;

public class PlayPlan {

	// Constants
	private final static String ROCK = "rock";
	private final static String PAPER = "paper";
	private final static String SCISSORS = "scissors";

	// Change in case you want more or less Rounds
	private final static int ROUNDS = 100;

	public PlayPlan() {

	}

	public void playGame() {

		// Default value for player1
		String player1 = ROCK;
		String player2;

		// counters
		int player1Wins = 0;
		int player2Wins = 0;
		int draw = 0;

		// Iterate number of rounds
		for (int i = 0; i < ROUNDS; i++) {

			// Call static method who return a ramdon choice for the player
			player2 = player2Choice();

			// Call static method which return the result of the round
			String winner = whoWins(player1, player2);

			// Fill counters
			if ("player1".equals(winner)) {
				player1Wins++;
			} else if ("player2".equals(winner)) {
				player2Wins++;
			} else if ("draw".equals(winner)) {
				draw++;
			}
		}

		// Show the result
		System.out.println("Final Score of Rock-Paper-Scissor Game");
		System.out.println("Player 1 always play ROCK and Wins: " + player1Wins + " rounds");
		System.out.println("Player 2 play ramdon choice and Wins: " + player2Wins + " rounds");
		System.out.println("Both Players Draws: " + draw + " rounds");

	}

	/**
	 * Method that is responsible to compare the items and return the winner
	 * 
	 * @param player1
	 * @param player2
	 * @return String
	 */
	public String whoWins(String player1, String player2) {
		if (player1.equals(player2))
			return "draw";
		switch (player2) {
		case ROCK:
			return (player1 == SCISSORS ? "player2" : "player1");

		case PAPER:
			return (player1 == ROCK ? "player2" : "player1");

		case SCISSORS:
			return (player1 == PAPER ? "player2" : "player1");

		default:
			return "draw";
		}

	}

	/**
	 * Method that is responsible to return a ramdon choice for a player
	 * 
	 * @return String getItem return
	 */
	public String player2Choice() {

		// Create a Random object.
		Random random = new Random();

		// Ramdon number between 1-3
		int numberChoice = random.nextInt(3) + 1;

		// Return the player random choice
		return getItem(numberChoice);
	}

	/**
	 * Method that is responsible to return the player item 1-rock / 2-scissors /
	 * 3-paper
	 * 
	 * @param numberChoice
	 * @return String item
	 */
	public String getItem(int numberChoice) {

		String item;

		switch (numberChoice) {
		case 1:
			item = "rock";
			break;
		case 2:
			item = "scissors";
			break;
		case 3:
			item = "paper";
			break;
		default:
			item = null;
		}

		return item;
	}

}
