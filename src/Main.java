
import javax.swing.*;

import view.*;

public class Main {


	public static void main(String[] args) {
		
		JFrame frame = new ChessFrame();
		
		frame.setIconImage(new ImageIcon("img/icon.jpg").getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
