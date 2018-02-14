package game;

import junit.framework.TestCase;

public class BowlingGameKataTest extends TestCase {
	private Game g;
	
	protected void setUp() throws Exception {
		g = new Game();
	}
	
	private void manyRolls(int n, int i) {
	 for (int j = 0; j < n; j++) {
		g.roll(i);
	 }	
	 
	}
	
	public void testGutterGame() throws Exception{
		manyRolls(20, 0);
		assertEquals(0, g.score());
	}
	
	public void testSpare() throws Exception{
		spare();
		g.roll(3);
		
		manyRolls(17, 0);
		assertEquals(16, g.score());
	}
	
	private void spare() {
		g.roll(5);
		g.roll(5);		
	}

	public void testStrike() throws Exception{
		g.roll(10);
		g.roll(3);
		g.roll(4);
		
		manyRolls(16, 0);
		assertEquals(24, g.score());
	}
	
	public void testPerfectGame() throws Exception{
		manyRolls(20, 10);
		assertEquals(300, g.score());
	}
}
	

	
	

