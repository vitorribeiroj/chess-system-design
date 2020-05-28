package Chess;

import Boardgame.Board;
import Boardgame.Piece;

public class ChessPiece extends Piece {

	private Color color;
	private Integer moveCount;
	
	
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}



	public Color getColor() {
		return color;
	}



	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
}
