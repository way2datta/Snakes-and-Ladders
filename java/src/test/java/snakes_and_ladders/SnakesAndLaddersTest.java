package snakes_and_ladders;

import org.junit.Assert;
import org.junit.Test;

public class SnakesAndLaddersTest {
	@Test
	public void validateDiceValue() {
		int diceValue = Board.getDiceValue();
		Assert.assertTrue("Dice value is not in range 1 to 6", diceValue > 0 && diceValue <= 6);
	}

	@Test
	public void validateNewPosition() {
		Assert.assertEquals("New postion is not calculated", 9, Board.getNextCellPosition(new Cell(4), 5));
	}

	@Test
	public void validateNewPositionForLadder() {
		Assert.assertEquals("Current position not respecting Ladder rise", 85, Board.getNextCellPosition(new Cell(34), 3));
	}

	@Test
	public void validateNewPositionForSnake() {
		Assert.assertEquals("Current position not respecting Snake bite", 35, Board.getNextCellPosition(new Cell(60), 5));
	}

	@Test
	public void validateNewPositionForAbove100() {
		Assert.assertEquals("Current position is exceeding 100", 96, Board.getNextCellPosition(new Cell(96), 5));
	}

}
