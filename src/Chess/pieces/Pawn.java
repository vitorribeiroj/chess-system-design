package Chess.pieces;

import Boardgame.Board;
import Boardgame.Position;
import Chess.ChessPiece;
import Chess.Color;

public class Pawn extends ChessPiece {
	
	public Pawn(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "P";
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);
		//ChessPiece piece = (ChessPiece) getBoard().piece(position);
		
		
		if(getColor() == Color.WHITE) {
			// Branco
			
			// Frente
			p.setValues(position.getRow() - 1, position.getColumn());
			if (getBoard().positionExists(p) && canMove(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			p.setValues(position.getRow() - 2, position.getColumn());
			Position p2 = new Position(position.getRow() - 1, position.getColumn());
			if (getBoard().positionExists(p) && canMove(p) &&
					getBoard().positionExists(p2) && canMove(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			// Diagonais
			p.setValues(position.getRow() - 1, position.getColumn()-1);
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			p.setValues(position.getRow() - 1, position.getColumn()+1);
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}			
		}
		else {
			//Preto
			
			// Frente
			p.setValues(position.getRow() + 1, position.getColumn());
			if (getBoard().positionExists(p) && canMove(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			p.setValues(position.getRow() + 2, position.getColumn());
			Position p2 = new Position(position.getRow() + 1, position.getColumn());
			if (getBoard().positionExists(p) && canMove(p) &&
					getBoard().positionExists(p2) && canMove(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			// Diagonais
			p.setValues(position.getRow() + 1, position.getColumn()-1);
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			p.setValues(position.getRow() + 1, position.getColumn()+1);
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		}
		

		return mat;
	}
}
