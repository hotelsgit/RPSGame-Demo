package demo;

public class RPSGame {

	private static PlayPlan playPlan;

	public RPSGame() {
		this(new PlayPlan());
	}

	RPSGame(PlayPlan playPlan) {
		
	}

	public static void main(String[] args) {

		playPlan = new PlayPlan();
		playPlan.playGame();
	}

}
