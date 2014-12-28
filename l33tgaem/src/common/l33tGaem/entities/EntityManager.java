package common.l33tGaem.entities;

import java.awt.Graphics;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import common.l33tGaem.init.Gaem;

/**Class to manage the positions of entities and mapping the textures to their position**/
public class EntityManager {
	/**just a test entity... a tentity **/
	private static Entity entity; 
	
	private static boolean test = true;

	public static void manage() {
		if(test) {
			Entity entity = new Entity(3, 3);
			test = false;
		}
	}
	
	public static void render(Graphics g){
		try {
			g.drawImage(ImageIO.read(Gaem.class.getResource("abcd.png")), entity.getX(), entity.getY(), null); //getting null pointer exception
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
