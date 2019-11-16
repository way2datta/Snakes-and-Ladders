package snakes_and_ladders;

import java.util.Collection;

public class GameBoard {

	private byte boardSize;
	private Collection<GameCatalyst> catalysts;
	public Collection<GameCatalyst> getCatalysts() {
		return catalysts;
	}

	public void setCatalysts(Collection<GameCatalyst> catalysts) {
		this.catalysts = catalysts;
	}

	private byte playerPosition;
	
	public byte getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(byte playerPosition) {
		this.playerPosition = playerPosition;
	}

	public GameBoard(byte boardSize, Collection<GameCatalyst> catalysts) {
		super();
		this.boardSize = boardSize;
		this.catalysts = catalysts;
	}

	public byte getBoardSize() {
		return boardSize;
	}

	public void setBoardSize(byte boardSize) {
		this.boardSize = boardSize;
	}


	public void play(byte curremtPosition, byte diceOutCome) {
		this.playerPosition = (byte) (curremtPosition + diceOutCome);
		GameCatalyst catalyst = findCatalystForCurrentPosition(catalysts);
		moveCurrentPosition(catalyst);
		if(this.playerPosition > boardSize) this.playerPosition = curremtPosition;
	}
	
	private void moveCurrentPosition(GameCatalyst catalyst) {
		if(catalyst != null) {
			this.playerPosition = catalyst.getEndPosition();
		}
	}
	
	private GameCatalyst findCatalystForCurrentPosition(Collection<GameCatalyst> catalysts) {
		for(GameCatalyst catalyst : catalysts) {
	        if(this.playerPosition == catalyst.getStartPosition()) {
	        	return catalyst;
	        }
	    }
		return null;
	}

}
