package snakes_and_ladders;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SnakeAndLadder {

	GameBoard board;

	@Before
	public void init() {
		Collection<GameCatalyst> catalysts = new ArrayList<GameCatalyst>();

		catalysts.add(new Ladder((byte) 7, (byte) 33));
		catalysts.add(new Ladder((byte) 37, (byte) 85));
		catalysts.add(new Ladder((byte) 51, (byte) 72));
		catalysts.add(new Ladder((byte) 63, (byte) 99));

		catalysts.add(new Snake((byte) 36, (byte) 19));
		catalysts.add(new Snake((byte) 65, (byte) 35));
		catalysts.add(new Snake((byte) 87, (byte) 32));
		catalysts.add(new Snake((byte) 97, (byte) 21));

		board = new GameBoard((byte) 100, catalysts);
	}

	@Test
	public void player_position_after_play() {
		board.play((byte) 4, (byte) 5);
		Assert.assertEquals(9, board.getPlayerPosition());
	}

	@Test
	public void player_position_after_ladder_encounter() {
		board.play((byte) 34, (byte) 3);
		Assert.assertEquals(85, board.getPlayerPosition());
	}
	
	@Test
	public void player_position_after_snake_encounter() {
		board.play((byte) 60, (byte) 5);
		Assert.assertEquals(35, board.getPlayerPosition());
	}
	
	@Test
	public void game_should_not_end_when_dice_outcome_greater_than_cell_required() {
		board.play((byte) 96, (byte) 5);
		Assert.assertEquals(96, board.getPlayerPosition());
	}
}
