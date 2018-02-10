package demo;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class RPSGameTest {

	RPSGame rpsGame;
	PlayPlan playPlan ;

	
	@Before
	public void setup() {
		
		rpsGame = new RPSGame(playPlan);
		playPlan = Mockito.mock(PlayPlan.class);
		
	}

	@Test
	public void testMain() {
		
		RPSGame.main(null);
		
		playPlan.playGame();

		Mockito.verify(playPlan, Mockito.times(1)).playGame();
	}

}