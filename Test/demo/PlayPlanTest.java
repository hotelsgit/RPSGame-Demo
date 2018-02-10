package demo;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class PlayPlanTest {
	
	PlayPlan playplan;
	
	PlayPlan playPlan2;
	
	PlayPlan play;
	
	Random random;
	
	private final static String ROCK = "rock";
	private final static String PAPER = "paper";
	private final static String SCISSORS = "scissors";
	
	private final static String PLAYER1 = "player1";
	private final static String PLAYER2 = "player2";
	private final static String DRAW = "draw";

	@Before
	public void setup() {
		
		playplan = new PlayPlan();
		
		playPlan2 = Mockito.mock(PlayPlan.class);
		
		random = Mockito.mock(Random.class);
	    play = new PlayPlan();
	    
	}
	
	@Test
	public void playGameTestPLayer1Win() {
		String player1 = ROCK;
		String player2 = SCISSORS;
		
		int player1Wins = 0;
		
		int param = 1;
			
			playPlan2.player2Choice();
			Mockito.verify(playPlan2).player2Choice();
			
			playPlan2.getItem(param);
			Mockito.verify(playPlan2).getItem(param);
			
			String result = playplan.whoWins(player1, player2);
			
			playPlan2.whoWins(player1, player2);
			Mockito.verify(playPlan2).whoWins(player1, player2);
			
			assertEquals(PLAYER1, result);
			
			if (PLAYER1.equals(result)) {
				player1Wins++;
			}
			
			assertEquals(1, player1Wins);
		
	}
	
	@Test
	public void playGameTestPLayer1Win1() {
		String player1 = SCISSORS;
		String player2 = PAPER;
		
		int player1Wins = 0;
		
		int param = 1;
			
			playPlan2.player2Choice();
			Mockito.verify(playPlan2).player2Choice();
			
			playPlan2.getItem(param);
			Mockito.verify(playPlan2).getItem(param);
			
			String result = playplan.whoWins(player1, player2);
			
			playPlan2.whoWins(player1, player2);
			Mockito.verify(playPlan2).whoWins(player1, player2);
			
			assertEquals(PLAYER1, result);
			
			if (PLAYER1.equals(result)) {
				player1Wins++;
			}
			
			assertEquals(1, player1Wins);
		
	}
	
	@Test
	public void playGameTestPLayer1Win2() {
		String player1 = PAPER;
		String player2 = ROCK;
		
		int player1Wins = 0;
		
		int param = 1;
			
			playPlan2.player2Choice();
			Mockito.verify(playPlan2).player2Choice();
			
			playPlan2.getItem(param);
			Mockito.verify(playPlan2).getItem(param);
			
			String result = playplan.whoWins(player1, player2);
			
			playPlan2.whoWins(player1, player2);
			Mockito.verify(playPlan2).whoWins(player1, player2);
			
			assertEquals(PLAYER1, result);
			
			if (PLAYER1.equals(result)) {
				player1Wins++;
			}
			
			assertEquals(1, player1Wins);
		
	}
	
	@Test
	public void playGameTestPLayer2Win() {
		String player1 = ROCK;
		String player2 = PAPER;
		
		int player2Wins = 0;
		
		int param = 1;
		
			playPlan2.player2Choice();
			Mockito.verify(playPlan2).player2Choice();
			
			playPlan2.getItem(param);
			Mockito.verify(playPlan2).getItem(param);
			
			String result = playplan.whoWins(player1, player2);
			
			playPlan2.whoWins(player1, player2);
			Mockito.verify(playPlan2).whoWins(player1, player2);
			
			assertEquals(PLAYER2, result);
			
			if (PLAYER2.equals(result)) {
				player2Wins++;
			} 
			
			assertEquals(1, player2Wins);
		
	}
	
	@Test
	public void playGameTestPLayer2Win1() {
		String player1 = PAPER;
		String player2 = SCISSORS;
		
		int player2Wins = 0;
		
		int param = 1;
		
			playPlan2.player2Choice();
			Mockito.verify(playPlan2).player2Choice();
			
			playPlan2.getItem(param);
			Mockito.verify(playPlan2).getItem(param);
			
			String result = playplan.whoWins(player1, player2);
			
			playPlan2.whoWins(player1, player2);
			Mockito.verify(playPlan2).whoWins(player1, player2);
			
			assertEquals(PLAYER2, result);
			
			if (PLAYER2.equals(result)) {
				player2Wins++;
			} 
			
			assertEquals(1, player2Wins);
		
	}
	
	@Test
	public void playGameTestPLayer2Win2() {
		String player1 = SCISSORS;
		String player2 = ROCK;
		
		int player2Wins = 0;
		
		int param = 1;
		
			playPlan2.player2Choice();
			Mockito.verify(playPlan2).player2Choice();
			
			playPlan2.getItem(param);
			Mockito.verify(playPlan2).getItem(param);
			
			String result = playplan.whoWins(player1, player2);
			
			playPlan2.whoWins(player1, player2);
			Mockito.verify(playPlan2).whoWins(player1, player2);
			
			assertEquals(PLAYER2, result);
			
			if (PLAYER2.equals(result)) {
				player2Wins++;
			} 
			
			assertEquals(1, player2Wins);
		
	}
	
	@Test
	public void playGameTestDraw() {
		String player1 = ROCK;
		String player2 = ROCK;
		
		
		int draw = 0;
		
		int param = 1;
		
			playPlan2.player2Choice();
			Mockito.verify(playPlan2).player2Choice();
			
			playPlan2.getItem(param);
			Mockito.verify(playPlan2).getItem(param);
			
			String result = playplan.whoWins(player1, player2);
			
			playPlan2.whoWins(player1, player2);
			Mockito.verify(playPlan2).whoWins(player1, player2);
			
			assertEquals(DRAW, result);
			
			if (DRAW.equals(result)) {
				draw++;
			} 
			
			assertEquals(1, draw);
		
	}
	
	@Test
	public void playGameTestDraw1() {
		String player1 = SCISSORS;
		String player2 = SCISSORS;
		
		
		int draw = 0;
		
		int param = 1;
		
			playPlan2.player2Choice();
			Mockito.verify(playPlan2).player2Choice();
			
			playPlan2.getItem(param);
			Mockito.verify(playPlan2).getItem(param);
			
			String result = playplan.whoWins(player1, player2);
			
			playPlan2.whoWins(player1, player2);
			Mockito.verify(playPlan2).whoWins(player1, player2);
			
			assertEquals(DRAW, result);
			
			if (DRAW.equals(result)) {
				draw++;
			} 
			
			assertEquals(1, draw);
		
	}
	
	@Test
	public void playGameTestDraw2() {
		String player1 = PAPER;
		String player2 = PAPER;
		
		
		int draw = 0;
		
		int param = 1;
		
			playPlan2.player2Choice();
			Mockito.verify(playPlan2).player2Choice();
			
			playPlan2.getItem(param);
			Mockito.verify(playPlan2).getItem(param);
			
			String result = playplan.whoWins(player1, player2);
			
			playPlan2.whoWins(player1, player2);
			Mockito.verify(playPlan2).whoWins(player1, player2);
			
			assertEquals(DRAW, result);
			
			if (DRAW.equals(result)) {
				draw++;
			} 
			
			assertEquals(1, draw);
		
	}
	
	@Test
	public void playGameTestNull() {
		String player1 = null;
		String player2 = null;
		
		
		int draw = 0;
		
		int param = 1;
		
		try {
			playPlan2.player2Choice();
			Mockito.verify(playPlan2).player2Choice();
			
			playPlan2.getItem(param);
			Mockito.verify(playPlan2).getItem(param);
			
			String result = playplan.whoWins(player1, player2);
			
			playPlan2.whoWins(player1, player2);
			Mockito.verify(playPlan2).whoWins(player1, player2);
			
			assertEquals(DRAW, result);
			
			if (DRAW.equals(result)) {
				draw++;
			} 
			
			assertEquals(1, draw);
		}catch (Throwable expected) {
	        assertEquals(NullPointerException.class, expected.getClass());
	    }
		
	}
	
	@Test
	public void testWhoWinsRockPaper() {
		
		String result = playplan.whoWins(ROCK, PAPER);
		
		assertEquals(PLAYER2, result);
	}
	
	@Test
	public void testWhoWinsPaperRock() {
		
		String result = playplan.whoWins(PAPER, ROCK);
		
		assertEquals(PLAYER1, result);
	}
	
	@Test
	public void testWhoWinsPaperPaper() {
		
		String result = playplan.whoWins(PAPER, PAPER);
		
		assertEquals(DRAW, result);
	}
	
	@Test
	public void testWhoWinsRockScissors() {
		
		String result = playplan.whoWins(ROCK, SCISSORS);
		
		assertEquals(PLAYER1, result);
	}
	
	@Test
	public void testWhoWinsScissorsRock() {
		
		String result = playplan.whoWins(SCISSORS, ROCK);
		
		assertEquals(PLAYER2, result);
	}
	
	@Test
	public void testWhoWinsScissorsScissor() {
		
		String result = playplan.whoWins(SCISSORS, SCISSORS);
		
		assertEquals(DRAW, result);
	}
	
	@Test
	public void testWhoWinsRockRock() {
		
		String result = playplan.whoWins(ROCK, ROCK);
		
		assertEquals(DRAW, result);
	}
	
	@Test
	public void testWhoWinsScissorsPaper() {
		
		String result = playplan.whoWins(SCISSORS, PAPER);
		
		assertEquals(PLAYER1, result);
	}
	
	@Test
	public void testWhoWinsPaperScissors() {
		
		String result = playplan.whoWins(PAPER, SCISSORS);
		
		assertEquals(PLAYER2, result);
	}
	
	@Test
	public void testWhoWinsNull() {

		try {
			playplan.whoWins(null, null);
	        fail("should've thrown an exception");
	    } catch (Throwable expected) {
	        assertEquals(NullPointerException.class, expected.getClass());
	    }
	}
	
	@Test
	public void testPlayer2Choice() {
		
	    boolean asert = false;

	    //Act
	    String actual = play.player2Choice();
	    
	    if(actual.equals(ROCK) || actual.equals(SCISSORS) || actual.equals(PAPER)) {
	    	asert = true;
	    }
	    
	    //Assert
	    assertTrue(asert);
	}
	
	@Test
	public void testGetItemRock() {
		
		String result = playplan.getItem(1);
		
		assertEquals(ROCK, result);
	}
	
	@Test
	public void testGetItemScissors() {
		
		String result = playplan.getItem(2);
		
		assertEquals(SCISSORS, result);
	}
	
	@Test
	public void testGetItemPaper() {
		
		String result = playplan.getItem(3);
		
		assertEquals(PAPER, result);
	}
	
	@Test
	public void testGetItemNull() {
		
		String result = playplan.getItem(0);
		
		assertEquals(null, result);
	}

}
