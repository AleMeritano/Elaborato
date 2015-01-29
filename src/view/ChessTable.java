package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.pieces.Chessman;

public class ChessTable extends JFrame {

	JButton[][] button = new JButton[8][8];
	JPanel ChessGrid;
	
	public ChessTable(Chessman[][] Game){
		
		this.ChessGrid = Chesspanel(Game);
		
	}
	
	private JPanel Chesspanel(Chessman[][] Game){
		
		JPanel p1 = new JPanel();
		Color black = new Color(101,67,33);
		Color white = new Color(205,127,55);
		
		p1.setLayout(new GridLayout(8,8));
		
		for(int i=0; i<8; i++)
			for(int j=0; j<8; j++){

				button[i][j] = new JButton(Game[i][j].printImage());

				button[i][j].setBackground((i+j)%2!=0 ? black : white);
				button[i][j].setSize(80, 80);
				
				p1.add(button[i][j]);
				
			}
		
		return p1;
		
	}
	
	public JPanel getPanel(){
		return ChessGrid;
	}
}
