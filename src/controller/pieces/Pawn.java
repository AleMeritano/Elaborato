package controller.pieces;

import javax.swing.ImageIcon;

import controller.Piece;
import controller.Teams;

public class Pawn extends Chessman {

	public Pawn(Teams color){
		
		super(color, Piece.PAWN);
	}
	
	@Override
	public ImageIcon printImage() {
		
		if(this.getColor() == Teams.BLACK)
			return new ImageIcon("img/Npedina.png");
		else
			return new ImageIcon("img/Bpedina.png");
	}

	public boolean mkMove(Chessman[][] table, int ax, int ay, int bx, int by){
		
		//check if in the diagonals tiles there is a chessman
		if(((bx == ax+1 || bx == ax -1) && by == ay+1)
				&&(table[bx][by].getName() != Piece.EMPTYMAN)
				&& !(table[ax][ay].checkColor(table[bx][by])))
			jump(table, bx, by);
		else if (bx != ax || by != ay+1) //check if pawn moves just for one tile
			return false;
		
		return true;
		
		
	}
}
