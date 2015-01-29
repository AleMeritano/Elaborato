package model;

import view.*;
import controller.pieces.*;
import controller.*;

public interface Model {
	
	public Piece at(Chessman[][] game, int x, int y);

	public void setView(View listener);
	
	public void move(Chessman[][] game, int x, int y, int x2, int y2);
}
