package snakes_and_ladders;

import org.junit.Assert;
import org.junit.Test;

public class SnakesAndLaddersTest {
	@Test
	public void validateDiceValue() {
		int diceValue = Board.getDiceValue();
		Assert.assertTrue(diceValue > 0 && diceValue <= 6);
	}

	@Test
	public void validateNewPosition() {
		Assert.assertEquals(9, Board.getNextPositon(new Cell(4), 5));
	}

	@Test
	public void validateNewPosition1() {
		Assert.assertEquals(33, Board.getNextPositon(new Cell(5), 2));
	}

	@Test
	public void validateNewPositionForLadder() {
		Assert.assertEquals(85, Board.getNextPositon(new Cell(34), 3));
	}

	@Test
	public void validateNewPositionForSnake() {
		Assert.assertEquals(35, Board.getNextPositon(new Cell(60), 5));
	}

	@Test
	public void validateNewPositionForAbove100() {
		Assert.assertEquals(96, Board.getNextPositon(new Cell(96), 5));
	}

}
