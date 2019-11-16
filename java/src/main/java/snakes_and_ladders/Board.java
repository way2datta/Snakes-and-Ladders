package snakes_and_ladders;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
	static List<Cell> board;
	private static final int MAXVALUES = 100;
	static {
		board = new ArrayList<Cell>();
		for (int i = 1; i <= 100; i++) {
			board.add(new Cell(i));
		}
		try {
			readFromProperties();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int getDiceValue() {
		return ThreadLocalRandom.current().nextInt(1, 6 + 1);
	}

	private static void readFromProperties() throws IOException {
		InputStream input = new FileInputStream("values.properties");
		Properties prop = new Properties();
		prop.load(input);
		setSnakeAndLadderValues(prop);
	}

	private static void setSnakeAndLadderValues(Properties prop) {
		Iterator<Entry<Object, Object>> it = prop.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Object, Object> obj = it.next();
			Cell currCell = board.get(board.indexOf(new Cell(Integer.parseInt((String) obj.getKey()))));
			currCell.setNextPosition(Integer.parseInt((String) obj.getValue()));
		}
	}

	public static int getNextCellPosition(Cell currCell, int diceValue) {
		int newPosition = currCell.getNextPositon(diceValue);
		if (newPosition > MAXVALUES) {
			return currCell.currentPosition;
		}
		Cell nextCell = board.get(board.indexOf(new Cell(newPosition)));
		return nextCell.nextPosition == 0 ? newPosition : nextCell.nextPosition;
	}

}
