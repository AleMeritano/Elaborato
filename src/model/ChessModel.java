package model;

import view.View;
import controller.pieces.*;
import controller.*;

public class ChessModel implements Model {

	@Override
	public Piece at(Chessman[][] game, int x, int y) {
		
		return game[x][y].getName();
		
	}

	@Override
	public void setView(View listener) {
		// TODO Auto-generated method stub

	}
	
	public void move(Chessman[][] game, int x, int y, int x2, int y2){
		
		game[x][y].mkMove(game, x, y, x2, y2);
	
	}

}
