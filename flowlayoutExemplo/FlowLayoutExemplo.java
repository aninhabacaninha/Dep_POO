package flowlayoutExemplo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class FlowLayoutExemplo extends JFrame implements ItemListener {
	private ButtonGroup grupobtn;
	private JRadioButton btnLeft, btnCenter, btnRight;
	private FlowLayout layout;
	
	public FlowLayoutExemplo() {
		setTitle("FlowLayout");
		setSize(400, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		layout = new FlowLayout(FlowLayout.CENTER);
		container.setLayout(layout);
		
		btnLeft = new JRadioButton("Left");
		btnLeft.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				layout.setAlignment(FlowLayout.LEFT);
				layout.layoutContainer(container);
			}
		});
		
		btnCenter = new JRadioButton("Center");
		btnCenter.setSelected(true);
		btnCenter.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				layout.setAlignment(FlowLayout.CENTER);
				layout.layoutContainer(container);
			}
		});
		
		btnRight = new JRadioButton("Right");
		btnRight.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				layout.setAlignment(FlowLayout.RIGHT);
				layout.layoutContainer(container);
			}
		});
		
		grupobtn = new ButtonGroup();
		grupobtn.add(btnLeft);
		grupobtn.add(btnCenter);
		grupobtn.add(btnRight);
		
		container.add(btnLeft);
		container.add(btnCenter);
		container.add(btnRight);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(btnLeft.isSelected()) {
			layout.setAlignment(FlowLayout.LEFT);
			layout.layoutContainer(getContentPane());
		} else if(btnCenter.isSelected()) {
			layout.setAlignment(FlowLayout.CENTER);
			layout.layoutContainer(getContentPane());
		} else if(btnRight.isSelected()) {
			layout.setAlignment(FlowLayout.RIGHT);
			layout.layoutContainer(getContentPane());
		}
	}
	
	public static void main(String[] args) {
		FlowLayoutExemplo exemplo = new FlowLayoutExemplo();
		exemplo.setVisible(true);
	}
}
