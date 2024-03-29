package DoisDoOito;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Hashtable;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MinhaJanela extends JFrame {
	    public MinhaJanela() {
		
		//config da janela
		setTitle("Formulário de Cadastro de Usuário");
		setSize(470, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setSize(50,30);
        lblNome.setLocation(10,10);
        
        JTextField txtNome = new JTextField();
        //definir a largura e altura
        txtNome.setSize(200,25);
        //definir a posição do elemento na tela horizontal e vertical
        txtNome.setLocation(60,15);
        
        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setSize(50,30);
        lblIdade.setLocation(10,50);
        
        //Lista de idade até 18
        String[] lista = new String[]{"1","2","3","4"};
        JComboBox cblIdade = new JComboBox(lista);
        //aparece apenas três dados a cada rolagem
        cblIdade.setMaximumRowCount(3);
        cblIdade.setSize(50,20);
        cblIdade.setLocation(60,60);
        
        JLabel lSexo = new JLabel("Sexo:");
        lSexo.setSize(50,30);
        //definir a posição do elemento na tela horizontal e vertical
        lSexo.setLocation(10,90);
        
        //não aparecem
		JRadioButton botaofem = new JRadioButton("Fem.");
        botaofem.setSize(60,20);
        botaofem.setLocation(60,90);
		JRadioButton botaomasc = new JRadioButton("Masc.");
        botaomasc.setSize(75,20);
        botaomasc.setLocation(120,90);
		
		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(botaofem);
		grupo2.add(botaomasc);
		
        JLabel lblEndereco = new JLabel("Endereço:");
        //definir a largura e altura
        lblEndereco.setSize(80,30);
        lblEndereco.setLocation(10,120);
        
        JTextField txtEndereco = new JTextField();
        //definir a largura e altura
        txtEndereco.setSize(200,25);
        //definir a posição do elemento na tela horizontal e vertical
        txtEndereco.setLocation(80,123);
        
        JLabel lblNoticias = new JLabel("Notícias de interesse:");
        lblNoticias.setSize(130,30);
        lblNoticias.setLocation(10,160);
        
        //não aparecem
        JCheckBox chEconomia = new JCheckBox("Economia");
        chEconomia.setSize(120,20);
        chEconomia.setLocation(60,180);
        
		JCheckBox chEducacao = new JCheckBox("Educação");
        chEducacao.setSize(120,20);
        chEducacao.setLocation(60,200);
        
		JCheckBox chEsporte = new JCheckBox("Esporte");
        chEsporte.setSize(120,20);
        chEsporte.setLocation(60,220);
        
		JCheckBox chTecnologia = new JCheckBox("Tecnologia");
		chTecnologia.setSize(120,20);
		chTecnologia.setLocation(60,240);
		
		JLabel lblconhecimento = new JLabel("Nível de conhecimento em Informática:");
		lblconhecimento.setSize(240,30);
		lblconhecimento.setLocation(10,260);
		
		JSlider slider1 = new JSlider(SwingConstants.HORIZONTAL, 0, 20, 0);
		slider1.setMajorTickSpacing(10);
		Hashtable<Integer, JLabel> labels = new Hashtable<>(); 
		
		labels.put(0, new JLabel("Básico")); 
		labels.put(10, new JLabel("Intermediário")); 
		labels.put(20, new JLabel("Avançado")); 
		slider1.setLabelTable(labels); 
		slider1.setPaintLabels(true);
		
		slider1.setPaintTicks(true);
		slider1.setPaintLabels(true);
		slider1.setSize(200,50);
		slider1.setLocation(60,300);
		
        JLabel lblInfo = new JLabel("Informações Adicionais:");
        lblInfo.setSize(240,30);
        lblInfo.setLocation(10,370);
        
		JTextField textField = new JTextField("Teste", 15);
		textField.setSize(240,50);
		textField.setLocation(10,400);
		JTextArea textArea = new JTextArea("Texto de teste", 15, 30);
		JScrollPane scroll2 = new JScrollPane(textArea);
		scroll2.setSize(240,50);
		scroll2.setLocation(10,400);
		
        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setSize(240,30);
        lblSenha.setLocation(10,450);
        
        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setSize(240,30);
        txtSenha.setLocation(10,480);
        
        
		
        Container cont = getContentPane();
        cont.setLayout(null);
        
		JPanel painel = new JPanel();
		painel.setLayout(new FlowLayout());
        painel.setSize(470,50);
        painel.setLocation(0,510);
		painel.setBackground(Color.GRAY);
		
        JButton btnCadastro = new JButton("Cadastrar");
        btnCadastro.setSize(200,50);
        //btnCadastro.setLocation(10,40);
        JButton btnCancelar = new JButton("Cadastrar");
        btnCancelar.setSize(300,50);
        
		painel.add(btnCadastro);
		painel.add(btnCancelar);
		cont.add(painel);
        
        cont.add(lblNome);
        cont.add(txtNome);
        
        
        cont.add(lblIdade);
        cont.add(cblIdade);
        
        cont.add(lSexo);
		cont.add(botaofem);
		cont.add(botaomasc);
		//cont.add(grupo2);
		
		cont.add(lblEndereco);
		cont.add(txtEndereco);
		
		cont.add(lblNoticias);
		cont.add(chTecnologia);
		cont.add(chEsporte);
		cont.add(chEducacao);
		cont.add(chEconomia);
        
		cont.add(lblconhecimento);
		
		cont.add(slider1);
		
		cont.add(lblInfo);
		cont.add(textArea);
		cont.add(textField);
		cont.add(scroll2);
		
		cont.add(lblSenha);
		cont.add(txtSenha);
		
		
       
	}

}