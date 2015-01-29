package controller.pieces;

import javax.swing.ImageIcon;

import controller.Piece;
import controller.Teams;

public class Knight extends Chessman {

	public Knight(Teams color){
		
		super(color, Piece.KNIGHT);
	}
	
	@Override
	public ImageIcon printImage() {
		
		if(this.getColor() == Teams.BLACK)
			return new ImageIcon("img/Ncavallo.png");
		else
			return new ImageIcon("img/Bcavallo.png");
	}

	public boolean mkMove(Chessman[][] table, int ax, int ay, int bx, int by){
		
		if(check(ax,ay,bx,by)){	//check if the move is legal
			if(table[bx][by].getColor()!=Teams.EMPTY){//if the chessman meets another chessman
				if (table[ax][ay].checkColor(table[bx][by]))//with different color
					jump(table, bx, by);
				else
					return false;
			}
			return true;
		}
		else
			return false;
		
	}

	//check if the move is L-shape
	private boolean check (int ax, int ay, int bx, int by){
		
		if((ax == bx - 2 || ax == bx + 2)&&(ay == by - 1 || ay == by + 1))
			return true;
		else if((ax == bx - 1 || ax == bx + 1)&&(ay == by - 2 || ay == by + 2))
			return true;
		else
			return false;
	}
}
