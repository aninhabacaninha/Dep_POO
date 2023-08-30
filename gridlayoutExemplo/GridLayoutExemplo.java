package gridlayoutExemplo;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExemplo extends JFrame {
	private JButton a, b, c, d, e;
	private GridLayout layout;
	
	public GridLayoutExemplo() {
		setTitle("GridLayout");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		layout = new GridLayout(3, 3, 5, 5);
		container.setLayout(layout);
		
		a = new JButton("A");
		b = new JButton("B");
		c = new JButton("C");
		d = new JButton("D");
		e = new JButton("E");
		
		container.add(a);
		container.add(b);
		container.add(c);
		container.add(d);
		container.add(e);
	}
	
	public static void main(String[] args) {
		GridLayoutExemplo exemplo = new GridLayoutExemplo();
		exemplo.setVisible(true);
	}
}
