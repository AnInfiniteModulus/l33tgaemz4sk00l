package common.l33tGaem.init;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class GraphicsManager {
	
	public static Graphics graphics = Gaem.getGaem().getGraphics();
	
	protected GraphicsManager() {
		
	}
	 
	public static void draw(Image img, int x, int y){
		graphics.drawImage(img, x, y, null);
	}
	
	public static void draw(Image img, int x, int y, int width, int height){
		graphics.drawImage(img, x, y, width, height, null);
	}
}
