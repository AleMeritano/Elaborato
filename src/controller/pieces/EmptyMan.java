package controller.pieces;

import javax.swing.*;

import controller.Piece;
import controller.Teams;

public class EmptyMan extends Chessman {

	public EmptyMan(){
		super(Teams.EMPTY, Piece.EMPTYMAN);
	}
	@Override
	public ImageIcon printImage() {
		return new ImageIcon("img/false.png");
	}
	@Override
	public boolean mkMove(Chessman[][] table, int ax, int ay, int bx, int by) {
		return true;
	}

}
