package common.l33tGaem.entities;

import java.awt.Image;
import java.awt.image.BufferedImage;

public class Entity {
	public int x;
	public int y;
	
	public boolean isGrounded;
	public boolean hasGravity;
	
	private Image[][] sprites; //technically should be a *italics* list *italics* of arrays, List's are arrays that are expandable
	
	public Entity(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public Image[] getSprites(short spriteNumber) {
		return sprites[spriteNumber];
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void registerIcons(BufferedImage[] imageArray, short spriteNumber) {
		// right here assign sprites to supplied image (might need to be an array)
		sprites[spriteNumber] = imageArray;
	}
}
