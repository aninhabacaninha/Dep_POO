package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CadastroView extends JFrame {
	JTextField txtNome, txtSaldo;
	JLabel lblNome, lblSenha, lblSaldo;
	JPasswordField psSenha;
	JRadioButton rUsuario, rVendedor;
	JButton btnCadastrar, btnCancelar;
	BorderLayout layoutInferior;
	
	public CadastroView() {
		setTitle("Cadastro");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		layoutInferior = new BorderLayout(10, 20);
		//setVisible(true);
		
		Container cont = getContentPane();
		cont.setLayout(null);
		
		lblNome = new JLabel("Nome: ");
		lblNome.setSize(50, 20);
		lblNome.setLocation(20, 29);
		txtNome = new JTextField();
		txtNome.setSize(150, 20);
		txtNome.setLocation(70, 30);
		
		lblSenha = new JLabel("Senha: ");
		lblSenha.setSize(50, 10);
		lblSenha.setLocation(20, 74);
		psSenha = new JPasswordField();
		psSenha.setSize(100, 20);
		psSenha.setLocation(70, 70);
		
		lblSaldo = new JLabel("Insira o seu saldo: ");
		lblSaldo.setSize(130, 10);
		lblSaldo.setLocation(20, 109);
		txtSaldo = new JTextField();
		txtSaldo.setSize(120, 20);
		txtSaldo.setLocation(135, 105);
		
		cont.add(lblNome);
		cont.add(txtNome);
		cont.add(lblSenha);
		cont.add(psSenha);
		cont.add(lblSaldo);
		cont.add(txtSaldo);
	}
	
	public static void main(String[] args) {
		CadastroView janela = new CadastroView();
		janela.setVisible(true);
	}
}
