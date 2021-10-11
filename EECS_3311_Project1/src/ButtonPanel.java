
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	private ArrayList<Shape> list;
	private static ButtonPanel instance = null;
	private Panel panel;
	private JButton loadButton;
	private JButton sortButton;
	private JFrame frame;

	private ButtonPanel(Panel panel, JFrame frame) {
		this.panel = panel;
		this.frame = frame;
		list = new ArrayList<>();

		loadButton = new JButton("Load shapes");
		panel.add(loadButton);
		loadButton.setBounds(340, 10, 150, 30);
		loadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadShapes();
				paintShapes(frame.getGraphics());
				repaint();
			}
		});

		sortButton = new JButton("Sort shapes");
		panel.add(sortButton);
		sortButton.setBounds(510, 10, 150, 30);
		sortButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Collections.sort(list);
				SortingTechnique.sortShapes(list);
				paintShapes(frame.getGraphics());
				repaint();

			}
		});

	}

	public static ButtonPanel getInstance(Panel panel, JFrame frame) {
		if (instance == null) {
			instance = new ButtonPanel(panel, frame);

		}
		return instance;
	}

	private void loadShapes() {

		list.clear();

		String[] shapeOption = { "Rectangle", "Square", "Circle" };
		for (int i = 1; i <= 6; i++) {
			int randomInt = getRandomInt(0, 2);
			int upperX = 0; // xOccupied;
			int upperY = 0; // yOccupied;
			String shapeType = shapeOption[randomInt];
			int height = getRandomInt(30, 100);// Random Value
			int width = height;
			if (randomInt == 0) {
				width = getRandomInt(30, 200);// RandomValue
			}
			Color color = new Color(getRandomInt(0, 255), getRandomInt(0, 255), getRandomInt(0, 255));
			list.add(ShapeFactory.getShape(shapeType, upperX, upperY, width, height, color));

		}

	}

	private int getRandomInt(int min, int max) { // inclusive
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}

	public void paintShapes(Graphics g) {

		int xOccupied = 40;
		int yOccupied = 80;
		g.clearRect(10, 80, 1000, 1000);

		Graphics2D g2d = (Graphics2D) g;
	
		for (Shape shape : list) {
			if (list != null) {
				int width = shape.getWidth();
				shape.setUpperX(xOccupied);

				int height = shape.getHeight();
				shape.setUpperY(yOccupied);

				shape.drawShape(g2d);
				xOccupied += width + 10;
				yOccupied += height + 10;
			}
		}
	}

}