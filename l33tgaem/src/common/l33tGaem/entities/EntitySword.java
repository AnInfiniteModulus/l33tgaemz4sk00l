package common.l33tGaem.entities;

import java.awt.Image;

public class EntitySword extends EntityItem{
	
	public Image[] sprites; //I dont believe the sword should require an animation, but swords need different textures for the different meta-data
	public String[] swordMetadata;
	
	public EntitySword(int x, int y) {
		super(x, y);
		
	}
	
	public Image[] getSprites() {//use ImageIO.read(File file) to get sprites
		return sprites;
	}
	
	
	
}
