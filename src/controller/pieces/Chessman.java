package controller.pieces;

import javax.swing.*;
import controller.Teams;
import controller.Piece;

//SUPERCLASS
public abstract class Chessman {

	private Teams color;
	private Piece name;
	
	public Chessman(Teams color, Piece name){
		this.color = color; //false -> black
		this.name = name;
	}
	
	public abstract ImageIcon printImage();
	
	public Teams getColor(){
		return color;
	}
	
	public Piece getName(){
		return name;
	}
	
	public abstract boolean mkMove(Chessman[][] table, int ax, int ay, int bx, int by);
	
	public void jump(Chessman[][] table, int x, int y){
		
		//table[x][y].kill();
		table[x][y] = new EmptyMan();
		
	}
	
	public boolean checkColor(Chessman other){
		if(this.getColor() == other.getColor())
			return true;
		return false;
	}
	
	public void swap (Chessman first, Chessman other){
		Chessman temp = first;
		first = other;
		other = temp;
	}

}
