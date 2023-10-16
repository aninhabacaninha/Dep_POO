package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TelaConsulta extends JFrame {
	JLabel lblTextinho;
	JTextField txtAddInfo;
	JButton btnConsultarTable;
	JTable tabelinha;
	
	public TelaConsulta() {
		setTitle("Consultar");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		Container cont = getContentPane();
		
		lblTextinho = new JLabel("Adicione informações para pesquisar");
		lblTextinho.setSize(150, 50);
		lblTextinho.setLocation(5, 5);
		
		txtAddInfo = new JTextField();
		txtAddInfo.setSize(100, 50);
		txtAddInfo.setLocation(40, 10);
		
		cont.add(lblTextinho);
		//cont.add(txtAddInfo);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaConsulta consulta = new TelaConsulta();
	}
}
