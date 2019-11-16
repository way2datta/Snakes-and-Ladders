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

	static {
		board = new ArrayList<Cell>();
		for (int i = 1; i <= 100; i++) {
			board.add(new Cell(i)); //read from property
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
		Iterator<Entry<Object, Object>> it = prop.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Object, Object> obj = it.next();
			board.remove(new Cell(Integer.parseInt((String) obj.getKey())));
			board.add(new Cell(Integer.parseInt((String) obj.getKey()), Integer.parseInt((String) obj.getValue())));
		}
	}

	public static Object getNextPositon(Cell cell, int diceValue) {
		int nextPost = cell.currentPos + diceValue;
		if (nextPost > 100) {
			return cell.currentPos;
		}
		Cell nextCell = board.get(board.indexOf(new Cell(nextPost)));
		return nextCell.nextPos == 0 ? nextPost : nextCell.nextPos;
	}

	public static void main(String[] args) {
		new Board();
	}

}
