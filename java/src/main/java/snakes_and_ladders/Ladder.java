package snakes_and_ladders;

public class Ladder extends GameCatalyst {

	public Ladder(byte foot, byte top) {
		super();
		this.setStartPosition(foot);
		this.setEndPosition(top);
	}

}
