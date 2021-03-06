package common.l33tGaem.graphics;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import common.l33tGaem.init.Gaem;
import common.l33tGaem.reference.Reference;

public class GaemPanel extends JPanel{ 
	
	private static final long serialVersionUID = -3942786010224719556L;

	public GaemPanel(int height, int width, int scale, Gaem game) {
		super();
		
		JFrame window = new JFrame(Reference.GAME_TITLE);
		window.setPreferredSize(new Dimension(height * scale , width * scale));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(game);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
		game.start();
	}

	
}
