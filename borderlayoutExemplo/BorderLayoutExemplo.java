package borderlayoutExemplo;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BorderLayoutExemplo extends JFrame { 
	
	private JLabel lblNorth, lblSouth, lblWest, lblEast, lblCenter;
	private BorderLayout layout;
	
	public BorderLayoutExemplo() {
		setTitle("FlowLayout");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		layout = new BorderLayout(10, 20);
		container.setLayout(layout);
		
		lblNorth = new JLabel("North");
		lblSouth = new JLabel("South");
		lblWest = new JLabel("West");
		lblEast = new JLabel("East");
		lblCenter = new JLabel("Center");
		
		container.add(lblNorth, BorderLayout.NORTH);
		container.add(lblSouth, BorderLayout.SOUTH);
		container.add(lblWest, BorderLayout.WEST);
		container.add(lblEast, BorderLayout.EAST);
		container.add(lblCenter, BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		BorderLayoutExemplo exemplo = new BorderLayoutExemplo();
		exemplo.setVisible(true);
	}
}
