package Boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	

	protected Board getBoard() {
		return board;
	}


	public boolean[][] possibleMoves() {
		
		boolean pMoves[][] = null;
		
		return pMoves;
	}
	
	public boolean possibleMove(Position position) {
		
		boolean pos = false;
		
		return pos;
	}
	
	public boolean isThereAnyPossibleMove() {
		return true;
	}
	
}
