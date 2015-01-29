package controller.pieces;

import javax.swing.ImageIcon;

import controller.Piece;
import controller.Teams;

public class Queen extends Chessman {

	public Queen(Teams color){
		
		super(color, Piece.QUEEN);
	}
	
	@Override
	public ImageIcon printImage() {
		
		if(this.getColor() == Teams.BLACK)
			return new ImageIcon("img/Nregina.png");
		else
			return new ImageIcon("img/Bregina.png");
	}

	public boolean mkMove(Chessman[][] table, int ax, int ay, int bx, int by){
		
		int vx = 0, vy = 0;
		int x, y;
		
		//set vx on -1 if the first coordinate comes before the second one
		//set vx on 1 if the first one comes after the second one
		//let vx set to 0 if they are on the same line			
		
		vx = ax > bx ? -1 : 1;
		vy = ay > by ? -1 : 1;
			
			//check the path chosen
			for(x=ax, y=ay; x!=bx && y!=by; x+=vx, y+=vy){
				
				//check if there are any chessman
				if(table[x][y].getName() != Piece.EMPTYMAN){
					
					//if the chessman has the same color return false
					if(table[x][y].checkColor(table[ax][ay])) 
						return false;
					else
						jump(table, x, y);
					break;
				}
							
			}
			
			return true;
		
	}
}
