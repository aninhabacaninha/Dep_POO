package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class PrincipalView extends JFrame implements ActionListener {
	JPanel painelCentral;
	JMenuBar menubar;
	JMenu mUsuario, mVendedor, mConfig; //configura o menu para aparecer os itens
	JMenuItem miCadastrar, miConsultaUsuario, miConsultaVendedor, miSair; //os itens do menu (botões)
	JButton btnCadastrar;
	
	BorderLayout layout;
	
	public PrincipalView() {
		setTitle("Lojinha de Instrumentos");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//definindo o layout do menu
		layout = new BorderLayout(10, 20);
		
		Container cont = getContentPane();
		
		//adicionando os itens no menu de config
		mConfig = new JMenu("Configurações");
		miSair = new JMenuItem("Sair");
		miSair.addActionListener(this);
		mConfig.add(miSair);
		
		//adicionando os itens no menu do usuario
		mUsuario = new JMenu("Usuário");
		miConsultaUsuario = new JMenuItem("Consultar");
		miConsultaUsuario.addActionListener(this);
		mUsuario.add(miConsultaUsuario);
		
		mVendedor = new JMenu("Vendedor");
		miConsultaVendedor = new JMenuItem("Consultar");
		miConsultaVendedor.addActionListener(this);
		mVendedor.add(miConsultaVendedor);

		menubar = new JMenuBar();
		menubar.add(mConfig);
		menubar.add(mUsuario);
		menubar.add(mVendedor);
		setJMenuBar(menubar);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setSize(100, 50);
		btnCadastrar.setLocation(10, 50);
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new CadastroView().setVisible(true);
			}
		});		
		cont.add(btnCadastrar, BorderLayout.NORTH);
		//add o menu e definindo ele na parte superior da tela
		cont.add(menubar, BorderLayout.NORTH);
		
		//painel central
		painelCentral = new JPanel();
		//fotinha p ilustrar
		getContentPane().add(painelCentral, BorderLayout.NORTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == miConsultaUsuario) {
			new ConsultarUsuario().setVisible(true);
		} else if(e.getSource() == miSair) {
			dispose();
		} else if(e.getSource() == miConsultaVendedor) {
			new ConsultarVendedor().setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		PrincipalView janela = new PrincipalView();
		janela.setVisible(true);
	}
}