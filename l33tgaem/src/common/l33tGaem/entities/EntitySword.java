package common.l33tGaem.entities;

import java.awt.Image;

public class EntitySword extends EntityItem{
	
	public String[] swordMetadata;
	
	
	
	public EntitySword() {
		
	}
	
	@Override
	public Image[] getSprites(short spriteNumber) {//use ImageIO.read(File file) to get sprites
		return sprites[spriteNumber];
	}
	
	
	
}
