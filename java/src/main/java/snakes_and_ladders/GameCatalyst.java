package snakes_and_ladders;

public abstract class GameCatalyst {

	private byte startPosition;
	public void setStartPosition(byte startPosition) {
		this.startPosition = startPosition;
	}
	public void setEndPosition(byte endPosition) {
		this.endPosition = endPosition;
	}
	public byte getStartPosition() {
		return startPosition;
	}
	public byte getEndPosition() {
		return endPosition;
	}
	private byte endPosition;
}
