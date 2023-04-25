package main;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
public class GameScreen extends JPanel {
	
	private Random random;
	private BufferedImage img;
	private ArrayList<BufferedImage> sprites = new ArrayList<>();
	
	public GameScreen(BufferedImage img)
	{
		random = new Random();
		this.img = img;
		
		LoadSprites();
	}
	
	private void LoadSprites() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 10; j++) {
				sprites.add(img.getSubimage(j*32, i*32, 32, 32));
			}
		}
		
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		LoadSprites();
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				g.drawImage(sprites.get(random.nextInt(20)), i*32, j*32,null);
			}
		}
		
		
	}

	private Color randColor() {
		int r = random.nextInt(256);
		int g = random.nextInt(256);
		int b = random.nextInt(256);

		return new Color(r,g,b);	
	}
}
