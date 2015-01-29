package controller.pieces;

import javax.swing.ImageIcon;

import controller.Piece;
import controller.Teams;

public class Bishop extends Chessman {
	
	public Bishop(Teams color){
		
		super(color, Piece.BISHOP);
		
	}
	
	@Override
	public ImageIcon printImage() {
		
		if(this.getColor() == Teams.BLACK)
			return new ImageIcon("img/Nalfiere.png");
		else
			return new ImageIcon("img/Balfiere.png");
	}

	public boolean mkMove(Chessman[][] table, int ax, int ay, int bx, int by){
				
		if((ax-ay)!=(bx-by)) //check if the coordinates are on the same diagonal
			return false;
		else{				//if they are on the same diagonal:
			int vx = ax > bx ? -1 : 1; //set vx on -1 if the first coordinate comes before the second one
			int vy = ay > by ? -1 : 1; //on 1 if the first one comes after the second one.
			int x, y;
			
			//check the path chosen
			for(x=ax, y=ay; x!=bx && y!=by; x+=vx, y+=vy){  
				//check if there are any chessmen
				if(table[x][y].getName() != Piece.EMPTYMAN){
					//if the chessman has the same color return false
					if(table[x][y].checkColor(table[ax][ay]))
						return false;
					else
						jump(table, x, y); // else jump the chessman
					break;
				}
							
			}
			return true;
		}
		
	}

}
