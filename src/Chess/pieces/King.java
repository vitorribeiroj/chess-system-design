package Chess.pieces;

import Boardgame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}
	
	
	@Override
	public String toString() {
		return "K";
	}

}
