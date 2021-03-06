package common.l33tGaem.entities;

import java.awt.Graphics;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import common.l33tGaem.init.Gaem;
import common.l33tGaem.init.GraphicsManager;

/**Class to manage the positions of entities and mapping the textures to their position**/
public class EntityManager {
	/**just a test entity... a tentity **/
	private static Entity entity; 

	public static void manage() {
		if(entity == null) {
			Entity entity = new Entity(3, 3);
		}
	}
	
	public static void render(Graphics g){
			try {
				//g.drawImage(ImageIO.read(Gaem.class.getResource("abcd.png")), entity.getX(), entity.getY(), null);
				GraphicsManager.draw(ImageIO.read(Gaem.class.getResource("abcd.png")), 1,1, 256, 256); //entity throws null pointer, works fine without using entity.getX, etc
			} catch (IOException e) {
				e.printStackTrace();
			} 
	
	}
	
}
