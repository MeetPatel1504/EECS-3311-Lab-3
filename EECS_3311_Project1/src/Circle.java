import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
	
	public Circle(int upperX, int upperY, int width, int height, Color shapeColour) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.width  = width;
		this.height = width;
		this.shapeColour = shapeColour;
		
	}

	
	public double getArea() {
		double radius = (getWidth()) / 2;
		return Math.PI * (Math.pow(radius, 2.0));
	}
	
	public void drawShape(Graphics	form) {

		form.setColor(getColor());
		form.fillOval(upperX, upperY, width, width);
	}
}
