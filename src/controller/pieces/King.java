package controller.pieces;

import javax.swing.ImageIcon;

import controller.Piece;
import controller.Teams;

public class King extends Chessman {

	public King(Teams color){
		
		super(color, Piece.KING);
	}
	
	@Override
	public ImageIcon printImage() {
		
		if(this.getColor() == Teams.BLACK)
			return new ImageIcon("img/Nre.png");
		else
			return new ImageIcon("img/Bre.png");
	}
	
	public boolean chessMate(Chessman[][] table, int x, int y, Teams colorN) {
		
		Teams color = colorN == Teams.BLACK ? Teams.WHITE : Teams.BLACK; // setta color con il colore opposto del re interessato
		
		//scanner the chesstable
		for(int i=0; i<8; i++)
			for(int j=0; j<8; j++)
				if(table[i][j].getColor() != Teams.EMPTY && table[i][j].getColor() == color)
					if(table[i][j].mkMove(table, i, j, x, y))
						return true;
				
		return false;
	}

	public boolean mkMove(Chessman[][] table, int ax, int ay, int bx, int by){
		
		if((java.lang.Math.abs(ax-bx) == 1)&&(java.lang.Math.abs(ay-by) == 1)&&(chessMate(table, bx, by, table[ax][ay].getColor()))){
			
			if(table[bx][by].getName() != Piece.EMPTYMAN){
				
				if(table[ax][ay].checkColor(table[bx][by]))
					return false;
				else
					jump(table, bx, by);
			}
			
			return true;
		} else
			return false;
		
	}
}
