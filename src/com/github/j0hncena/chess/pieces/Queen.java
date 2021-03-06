package com.github.j0hncena.chess.pieces;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Queen extends Piece{

	private static final long serialVersionUID = -530254142968974721L;

	public Queen(boolean isSuperior) {
		super(isSuperior);
	}

	@Override
	public void paint(Graphics g, int x, int y, JPanel panel) {
		super.drawPiece(g, x, y, PieceConstants.QUEEN, getColorNumber(), panel);
	}

	/* (non-Javadoc)
	 * @see com.github.chess.pieces.Piece#isValid(com.github.chess.pieces.Piece[][], int, int, int, int)
	 */
	@Override
	public boolean isValid(Piece[][] board, int fromX, int fromY, int toX, int toY) {
		return (checkStraightMovement(fromX, fromY, toX, toY) || checkDiagonalMovement(fromX, fromY, toX, toY)) && super.isValid(board, fromX, fromY, toX, toY);
	}
	
	
	
	public boolean checkStraightMovement(int fromX, int fromY, int toX, int toY) {
		if(fromX == toX || fromY == toY) {
			return true;
		}
		return false;
	}
	
	public boolean checkDiagonalMovement(int fromX, int fromY, int toX, int toY) {
		return Math.abs(toX - fromX) == Math.abs(toY - fromY); 
	}

	@Override
	public Piece clone() {
		return null;
	}



}
