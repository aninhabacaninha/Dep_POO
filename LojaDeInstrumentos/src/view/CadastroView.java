package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import dao.VendedorDAO;
import model.Usuario;

public class CadastroView extends JFrame {
	JTextField txtNome, txtSaldo;
	JLabel lblNome, lblSenha, lblSaldo, lblUsuorVend;
	JPasswordField psSenha;
	JRadioButton rSim, rNao;
	JButton btnCadastrar, btnCancelar;
	JPanel painelayout;
	
	public CadastroView() {
		setTitle("Cadastro");
		setSize(350, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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
		psSenha.setSize(150, 20);
		psSenha.setLocation(70, 70);
		
		lblSaldo = new JLabel("Insira o seu saldo: ");
		lblSaldo.setSize(130, 10);
		lblSaldo.setLocation(20, 109);
		txtSaldo = new JTextField();
		txtSaldo.setSize(90, 20);
		txtSaldo.setLocation(130, 105);
		
		lblUsuorVend = new JLabel("Você é um vendedor?");
		lblUsuorVend.setSize(200, 20);
		lblUsuorVend.setLocation(20, 140);
		
		ButtonGroup grupinho = new ButtonGroup();
		grupinho.add(rSim);
		grupinho.add(rNao);
		
		rSim = new JRadioButton("Sim");
		rSim.setSize(50, 20);
		rSim.setLocation(20, 165);
		rNao = new JRadioButton("Não");
		rNao.setSize(50, 20);
		rNao.setLocation(70, 165);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setSize(70, 30);
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Usuario usuario = new Usuario();
				usuario.setNome(txtNome.getText());
				String password = new String(psSenha.getPassword());
				usuario.setSenha(password);
				double saldo = Double.parseDouble(txtSaldo.getText());
				usuario.setSaldo(saldo);
				
				if(rSim.isSelected()) {
					VendedorDAO vendedor = new VendedorDAO();
					//vendedor.cadastrarVendedor();
				} else if(rNao.isSelected()) {
					usuario.cadastrarUsuario();
				}
			}
		});
		
		cont.add(lblNome);
		cont.add(txtNome);
		cont.add(lblSenha);
		cont.add(psSenha);
		cont.add(lblSaldo);
		cont.add(txtSaldo);
		cont.add(lblUsuorVend);
		cont.add(rSim);
		cont.add(rNao);
		
		painelayout = new JPanel();
		painelayout.setLayout(new FlowLayout(FlowLayout.LEFT));
		painelayout.setSize(350, 50);
		painelayout.setLocation(0, 220);
		painelayout.setBackground(Color.GRAY);
		painelayout.add(btnCadastrar);
		cont.add(painelayout);
	}
	
	public static void main(String[] args) {
		CadastroView janela = new CadastroView();
		janela.setVisible(true);
	}
}