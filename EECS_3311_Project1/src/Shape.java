import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Comparable<Shape> {

	protected int upperX; 
	protected int upperY;
	protected int width;
	protected int height;
	protected Color shapeColour;
	
	//getters
    public Color getColor() {
		return shapeColour;
	}
    
    public int getWidth() {
    	return width;
    }
    
    public int getHeight() {
    	return height;
    }
    
	public int getUpperX() {
		return upperX;
	}
	
	public int getUpperY() {
		return upperY;
	}

	
	public abstract double getArea();
	public abstract void drawShape(Graphics	form);
	
	
	//setters
	public void setColor(Color aShapeColor) {
		this.shapeColour = aShapeColor;
	}
		 
	public void setWidth( int width) {
		this.width = width;
	}
		    
	public void setHeight(int height) {
		this.height = height;
	}
		 
	public void setUpperX(int upperX) {
		this.upperX = upperX;
	}
			
	public void setUpperY(int upperY) {
		this.upperY = upperY;
	}
	
	
	//comparator
	@Override 
	public int compareTo(Shape s) {
		
		
		
		if (getArea() > s.getArea()) {
			return 1;
		}
		else if (getArea() < s.getArea()){
			return -1;
		}
		else {
			return 0;
		}
		
	}	
}	 
