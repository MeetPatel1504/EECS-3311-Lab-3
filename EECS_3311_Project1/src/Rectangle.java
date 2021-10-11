import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape{
	
	public Rectangle(int upperX, int upperY, int width, int height, Color shapeColour) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.width  = width;
		this.height = height;
		this.shapeColour = shapeColour;
		
	}

	public double getArea() {
		return getWidth() * getHeight();
	}

	public void drawShape(Graphics form) {
		form.setColor(getColor());	
		form.fillRect(upperX, upperY, width, height);
			
	}
}

