package snakes_and_ladders;

public class Snake extends GameCatalyst {

	public Snake(byte head, byte tail) {
		super();
		this.setStartPosition(head);
		this.setEndPosition(tail);
	}
}
