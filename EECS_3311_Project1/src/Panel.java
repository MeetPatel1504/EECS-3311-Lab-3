import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.*;

public class Panel extends JPanel {
	static JFrame frame;
	public static void main(String[] args) {
		frame = new JFrame(("Display Shapes"));
		Panel panel = new Panel();
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setSize(1000, 800);
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true);
		ButtonPanel.getInstance(panel,frame);
		
	
	}

}
