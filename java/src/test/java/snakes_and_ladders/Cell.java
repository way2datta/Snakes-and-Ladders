package snakes_and_ladders;

public class Cell {
	int currentPos;
	int nextPos;

	public Cell(int currentPos) {
		this.currentPos = currentPos;
	}

	public Cell(int currentPos, int nextPos) {
		this.currentPos = currentPos;
		this.nextPos = nextPos;
	}

	public static int getNextPositon(Cell cell, int diceValue) {
		int newPos = cell.getCurrentPos() + diceValue;

		return newPos;
	}

	@Override
	public boolean equals(Object obj) {
		return this.currentPos == ((Cell) obj).currentPos;
	}

	@Override
	public int hashCode() {
		return this.currentPos;
	}
	
	@Override
	public String toString() {
		return "[" + this.getCurrentPos() + " " + this.nextPos + "]";
	}

	public int getCurrentPos() {
		return currentPos;
	}

	public void setCurrentPos(int currentPos) {
		this.currentPos = currentPos;
	}

	public int getNextPos() {
		return nextPos;
	}

	public void setNextPos(int nextPos) {
		this.nextPos = nextPos;
	}

}
