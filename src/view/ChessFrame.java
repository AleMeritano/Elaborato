package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

import controller.*;
import controller.pieces.Chessman;

public class ChessFrame extends JFrame {

	private final Controller controller;
	public Chessman[][] game = new Chessman[8][8];
	private final int DEFAULT_WIDTH = 800;
	private final int DEFAULT_HEIGHT = 800;
	
	public ChessFrame(){
		setTitle("Chess Game");
		
		controller = new ChessControl();
		controller.start(game);
		
		JPanel north = new JPanel();
		JPanel center = new JPanel();
		JPanel south = new JPanel();
		
		JLabel scacch = new JLabel ("SCACCHIERA");
		north.setLayout(new GridLayout(2,2));
		scacch.setFont(new Font("Serif", Font.BOLD, 22));
		north.add(scacch);
		north.add(new JLabel(""));
		north.add(new JLabel(""));
		north.add(new JLabel("by Scapini Fabio, Facciotti Lucrezia e Franceschini Riccardo"));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		center.setLayout(new GridLayout(1,2));
		p1 = (new ChessTable(game)).getPanel();
		center.add(p1);
		p1.setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		
		p2.setLayout(new GridLayout(4,1));
		/*p2.add(new JLabel("Mosse Bianchi:"));
		p2.add(new JLabel("5"+"\n"));
		p2.add(new JLabel("Mosse Neri:"));
		p2.add(new JLabel("1"+"\n"));*/
		center.add(p2);
				
		add(north, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);
		
		pack();
		
	}
}
