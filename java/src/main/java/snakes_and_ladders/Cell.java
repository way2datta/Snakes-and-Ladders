package snakes_and_ladders;

public class Cell {
	int currentPosition;
	int nextPosition;

	public Cell(int currentPosition) {
		this.currentPosition = currentPosition;
	}

	@Override
	public boolean equals(Object obj) {
		return this.currentPosition == ((Cell) obj).currentPosition;
	}

	@Override
	public int hashCode() {
		return this.currentPosition;
	}

	@Override
	public String toString() {
		return "[" + this.getCurrentPosition() + "," + this.nextPosition + "]";
	}

	/***
	 * Getters & Setters
	 */

	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPos(int currentPos) {
		this.currentPosition = currentPos;
	}

	public int getNextPosition() {
		return nextPosition;
	}

	public void setNextPosition(int nextPosition) {
		this.nextPosition = nextPosition;
	}

	public int getNextPositon(int diceValue) {
		return this.currentPosition + diceValue;
	}

}
