package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class PrincipalView extends JFrame implements ActionListener {
	JPanel painelCentral;
	JMenuBar menubar;
	JMenu mUsuario, mConfig; //configura o menu para aparecer os itens
	JMenuItem miCadastrar, miConsultar, miSair; //os itens do menu (botões)
	
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
		mConfig.add(miSair);
		
		//adicionando os itens no menu do usuario
		mUsuario = new JMenu("Usuário");
		miCadastrar = new JMenuItem("Cadastrar");
		miConsultar = new JMenuItem("Consultar");
		mUsuario.add(miCadastrar);
		mUsuario.add(miConsultar);

		menubar = new JMenuBar();
		menubar.add(mConfig);
		menubar.add(mUsuario);
		setJMenuBar(menubar);
		
		//add o menu e definindo ele na parte superior da tela
		cont.add(menubar, BorderLayout.NORTH);
		
		//painel central
		painelCentral = new JPanel();
		//fotinha p ilustrar
		getContentPane().add(painelCentral, BorderLayout.NORTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == miCadastrar) {
			new CadastroView();
		} else if(e.getSource() == miConsultar) {
			//new ConsultarUsuario().setVisible(true);
		} else if(e.getSource() == miSair) {
			dispose();
		}
	}
	
	public static void main(String[] args) {
		PrincipalView janela = new PrincipalView();
		janela.setVisible(true);
	}
}