package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet {

	public void setup()
	{
		size(400, 400);
		background(0, 0, 0);
	}
	
	public void draw()
	{
		fill(255, 255, 0)
		ellipse(200, 200, 390, 390)
	}
}
