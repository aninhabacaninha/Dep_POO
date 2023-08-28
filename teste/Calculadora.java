package atividadeAssincrona;

	import java.awt.Color;
import java.awt.Container;
	import java.awt.Dimension;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

	public class Calculadora extends JFrame implements ActionListener{
		private JLabel display;
		private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
		private JButton btnC, btnCE, btnInverter, btnFechar;
		private JButton btnVirgula, btnAd, btnSub, btnMult, btnDiv, btnIgual;
		
		public Calculadora() {
			setTitle("Calculadora");
			setSize(350, 550);
			setResizable(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			Container container = getContentPane();
			container.setLayout(null);
			
			inicializarComponentes();
			
			container.add(display);
			container.add(btnFechar);
			container.add(btnCE);
			container.add(btnC);
			container.add(btnDiv);
			container.add(btn7);
			container.add(btn8);
			container.add(btn9);
			container.add(btnMult);
			container.add(btn4);
			container.add(btn5);
			container.add(btn6);
			container.add(btnSub);
			container.add(btn1);
			container.add(btn2);
			container.add(btn3);
			container.add(btnAd);
			container.add(btnVirgula);
			container.add(btn0);
			container.add(btnInverter);
			container.add(btnIgual);
		}
		
		public void inicializarComponentes() {
			display = new JLabel("0");
			display.setLocation(10, 10);
			display.setSize(4*80, 80);
			display.setBorder(BorderFactory.createLineBorder(null));
			
			final int altura = 75;
			final int largura = 75;
			Dimension dimensao = new Dimension(largura, altura);
			
			btnFechar = new JButton("Fechar");
			btnFechar.setLocation(10, 100);
			btnFechar.setSize(dimensao);
			btnFechar.addActionListener(this);
			btnFechar.setBackground(Color.RED);
			btnFechar.setForeground(Color.WHITE);
			
			btnCE = new JButton("CE");
			btnCE.setLocation(90, 100);
			btnCE.setSize(dimensao);
			btnCE.addActionListener(this);
			
			btnC = new JButton("C");
			btnC.setLocation(170, 100);
			btnC.setSize(dimensao);
			btnC.addActionListener(this);
			
			btnDiv = new JButton("/");
			btnDiv.setLocation(250, 100);
			btnDiv.setSize(dimensao);
			//btnDiv.addActionListener(this);
			
			btn7 = new JButton("7");
			btn7.setLocation(10, 180);
			btn7.setSize(dimensao);
			btn7.addActionListener(this);
			
			btn8 = new JButton("8");
			btn8.setLocation(90, 180);
			btn8.setSize(dimensao);
			btn8.addActionListener(this);
			
			btn9 = new JButton("9");
			btn9.setLocation(170, 180);
			btn9.setSize(dimensao);
			btn9.addActionListener(this);
			
			btnMult = new JButton("*");
			btnMult.setLocation(250, 180);
			btnMult.setSize(dimensao);
			//btnMult.addActionListener(this);
			
			btn4 = new JButton("4");
			btn4.setLocation(10, 260);
			btn4.setSize(dimensao);
			btn4.addActionListener(this);
			
			btn5 = new JButton("5");
			btn5.setLocation(90, 260);
			btn5.setSize(dimensao);
			btn5.addActionListener(this);
			
			btn6 = new JButton("6");
			btn6.setLocation(170, 260);
			btn6.setSize(dimensao);
			btn6.addActionListener(this);
			
			btnSub = new JButton("-");
			btnSub.setLocation(250, 260);
			btnSub.setSize(dimensao);
			//btnSub.addActionListener(this);
			
			btn1 = new JButton("1");
			btn1.setLocation(10, 340);
			btn1.setSize(dimensao);
			btn1.addActionListener(this);
			
			btn2 = new JButton("2");
			btn2.setLocation(90, 340);
			btn2.setSize(dimensao);
			btn2.addActionListener(this);
			
			btn3 = new JButton("3");
			btn3.setLocation(170, 340);
			btn3.setSize(dimensao);
			btn3.addActionListener(this);
			
			btnAd = new JButton("+");
			btnAd.setLocation(250, 340);
			btnAd.setSize(dimensao);
			//btnAd.addActionListener(this);
			
			btnVirgula = new JButton(",");
			btnVirgula.setLocation(10, 420);
			btnVirgula.setSize(dimensao);
			btnVirgula.addActionListener(this);
			
			btn0 = new JButton("0");
			btn0.setLocation(90, 420);
			btn0.setSize(dimensao);
			btn0.addActionListener(this);
			
			btnInverter = new JButton("+/-");
			btnInverter.setLocation(170, 420);
			btnInverter.setSize(dimensao);
			//btnInverter.addActionListener(this);
			
			btnIgual = new JButton("=");
			btnIgual.setLocation(250, 420);
			btnIgual.setSize(dimensao);
			//btnIgual.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnFechar) {
				Calculadora.this.dispose();
			} else if(e.getSource() == btn0) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay + "0";
				display.setText(textoDisplay);
			} else if(e.getSource() == btn1) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay + "1";
				display.setText(textoDisplay);
			} else if(e.getSource() == btn2) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay + "2";
				display.setText(textoDisplay);
			} else if(e.getSource() == btn3) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay + "3";
				display.setText(textoDisplay);
			} else if(e.getSource() == btn4) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay + "4";
				display.setText(textoDisplay);
			} else if(e.getSource() == btn5) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay + "5";
				display.setText(textoDisplay);
			} else if(e.getSource() == btn6) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay + "6";
				display.setText(textoDisplay);
			} else if(e.getSource() == btn7) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay + "7";
				display.setText(textoDisplay);
			} else if(e.getSource() == btn8) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay + "8";
				display.setText(textoDisplay);
			} else if(e.getSource() == btn9) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay + "9";
				display.setText(textoDisplay);
			} else if(e.getSource() == btnCE) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay.substring(0, textoDisplay.length() - textoDisplay.length());
				display.setText(textoDisplay);
			} else if(e.getSource() == btnC) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay.substring(0, textoDisplay.length() - textoDisplay.length());
				display.setText(textoDisplay);
			} else if(e.getSource() == btnVirgula) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay + ",";
				display.setText(textoDisplay);
				//contarvezesclique();
			} else if(e.getSource() == btnAd) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay + " + ";
				display.setText(textoDisplay);
				//adicao();
			} else if(e.getSource() == btnSub) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay + " + ";
				display.setText(textoDisplay);
				//subtr();
			} else if(e.getSource() == btnMult) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay + " + ";
				display.setText(textoDisplay);
				//multip();
			} else if(e.getSource() == btnDiv) {
				String textoDisplay = display.getText();
				textoDisplay = textoDisplay + " + ";
				display.setText(textoDisplay);
				//divisao();
			} 
		}
	}
