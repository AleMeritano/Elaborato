package controller;

import controller.pieces.*;

public class ChessControl implements Controller {

	@Override
	public void start (Chessman[][] Game) {
		
		Game[0][0]=new Rook(Teams.BLACK);
		Game[0][1]=new Knight(Teams.BLACK);
		Game[0][2]=new Bishop(Teams.BLACK);
		Game[0][3]=new Queen(Teams.BLACK);
		Game[0][4]=new King(Teams.BLACK);
		Game[0][5]=new Bishop(Teams.BLACK);
		Game[0][6]=new Knight(Teams.BLACK);
		Game[0][7]=new Rook(Teams.BLACK);
		
		for(int i=0; i<8; i++)
			Game[1][i]=new Pawn(Teams.BLACK);
		
		Game[7][0]=new Rook(Teams.WHITE);
		Game[7][1]=new Knight(Teams.WHITE);
		Game[7][2]=new Bishop(Teams.WHITE);
		Game[7][3]=new Queen(Teams.WHITE);
		Game[7][4]=new King(Teams.WHITE);		
		Game[7][5]=new Bishop(Teams.WHITE);
		Game[7][6]=new Knight(Teams.WHITE);
		Game[7][7]=new Rook(Teams.WHITE);
		
		for(int i=0; i<8; i++)
			Game[6][i] = new Pawn(Teams.WHITE);

				
		for(int j=2; j<6; j++)
			for(int i=0; i<8; i++)
				Game[j][i]= new EmptyMan();

	}

}
