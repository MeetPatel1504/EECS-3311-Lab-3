import java.awt.Color;

public class ShapeFactory {
	
	public static Shape getShape(String shapeType,int x,int y,int width,int height,Color colour) {
		
		if (shapeType == null){
			return null;
		}
		else if (shapeType.equalsIgnoreCase("Rectangle")){
			return new Rectangle(x, y, width, height, colour);
		}
		
		else if (shapeType.equalsIgnoreCase("Square")){
			return new Square(x, y, width, height, colour);
		}
		
		else if (shapeType.equalsIgnoreCase("Circle")){
			return new Circle(x, y, width, height, colour);
		}
		
		return null;
		
	}

}
