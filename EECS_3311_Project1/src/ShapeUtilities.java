import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class ShapeUtilities extends JPanel{/*
	private ArrayList<Shape> list = new ArrayList<>();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		for (Shape shape : list) {
			if (list != null) {
				shape.drawShape(g2d);
			}
		}
	}

	protected void loadShapes() {
		
		list.clear();
		int xOccupied = 0;
		int yOccupied = 0;
		String[] shapeOption = { "Rectangle", "Square", "Circle" };
		for (int i = 1; i <= 6; i++) {
			int randomInt = getRandomInt(0,2);
			int upperX = xOccupied;
			int upperY = yOccupied;
			String shapeType = shapeOption[randomInt];
			int height = getRandomInt(30,160);// Random Value
			int width = height;
			if (randomInt == 0) {
				width = getRandomInt(30,200);// RandomValue
			}
			Color color = new Color(getRandomInt(0,255),getRandomInt(0,255),getRandomInt(0,255));
			list.add(ShapeFactory.getShape(shapeType, upperX, upperY, width, height, color));
			xOccupied += height;
			yOccupied += width;
		}
	
	}

	/*public void addAllShapes(ArrayList<Shape> shapes) {
		this.list.addAll(shapes);

	}

	public void clearAllShapes() {
		list.clear();

	}*/
	
}
