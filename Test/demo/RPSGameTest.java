package demo;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class RPSGameTest {

	RPSGame rpsGame;
	PlayPlan playPlan ;

	
	@Before
	public void setup() {

		playPlan = Mockito.mock(PlayPlan.class);
		
	}

	@Test
	public void testMain() {
		
		playPlan.playGame();

		Mockito.verify(playPlan, Mockito.times(1)).playGame();
	}

}
