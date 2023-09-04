package listaUsuario;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Hashtable;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
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

public class CadastroUsuario extends JFrame {
    JLabel txtNome, txtIdade, txtSexo, txtEnder, txtNot, txtNivel, txtInfo, txtSenha;
    JTextField lblNome, lblEnder;
    JButton btnCadastrar, btnCancelar;
    JComboBox cbIdade;
    JCheckBox chEdu, chEco, chEsp, chTecno;
    JRadioButton rbMasc, rbFem;
    JSlider niveis;
    JTextArea txAInfo;
    JScrollPane scroll;
    JPasswordField psSenha;
    JPanel painelLayout;
    
    public CadastroUsuario() {
        setTitle("Formulário de Cadastro de Usuário");
        setSize(500, 635);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container cont = getContentPane();
        cont.setLayout(null);
        
        txtNome = new JLabel("Nome: ");
        txtNome.setSize(50, 50);
        txtNome.setLocation(15, 5);
        
        lblNome = new JTextField();
        lblNome.setSize(200, 30);
        lblNome.setLocation(70, 15);
        
        txtIdade = new JLabel("Idade: ");
        txtIdade.setSize(50, 50);
        txtIdade.setLocation(15, 50);
        
        String[] cb = new String[]{"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
        		"31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", 
        		"47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62",
        		"63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78",
        		"79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94",
        		"95", "96", "97", "98", "99", "100"};
        cbIdade = new JComboBox(cb);
        cbIdade.setMaximumRowCount(4);
        cbIdade.setSize(60, 25); //largura e altura
        cbIdade.setLocation(70, 65); //x e y
        
        txtSexo = new JLabel("Sexo: ");
        txtSexo.setSize(50, 50);
        txtSexo.setLocation(15, 100);
        
        rbMasc = new JRadioButton("Masculino");
        rbMasc.setSize(85, 50);
        rbMasc.setLocation(150, 100);
        rbFem = new JRadioButton("Feminino");
        rbFem.setSize(80, 50);
        rbFem.setLocation(70, 100);
        
        ButtonGroup grupinho = new ButtonGroup();
        grupinho.add(rbMasc);
        grupinho.add(rbFem);
        
        txtEnder = new JLabel("Endereço: ");
        txtEnder.setSize(70, 50);
        txtEnder.setLocation(15, 140);
        
        lblEnder = new JTextField();
        lblEnder.setSize(260, 30);
        lblEnder.setLocation(80, 150);
        
        txtNot = new JLabel("Notícias de Interesse");
        txtNot.setSize(150, 50);
        txtNot.setLocation(15, 185);
        
        chEdu = new JCheckBox("Educação");
        chEdu.setSize(100, 50);
        chEdu.setLocation(20, 215);
        chEco = new JCheckBox("Economia");
        chEco.setSize(100, 50);
        chEco.setLocation(120, 215);
        chEsp = new JCheckBox("Esporte");
        chEsp.setSize(80, 50);
        chEsp.setLocation(220, 215);
        chTecno = new JCheckBox("Tecnologia");
        chTecno.setSize(100, 50);
        chTecno.setLocation(300, 215);
        
        txtNivel = new JLabel("Nível de Conhecimento em Informática:");
        txtNivel.setSize(250, 50);
        txtNivel.setLocation(15, 250);
        
        niveis = new JSlider(SwingConstants.HORIZONTAL, 0, 20, 0);
        niveis.setMajorTickSpacing(10);
        
        Hashtable<Integer, JLabel> op = new Hashtable<>();
        op.put(0, new JLabel("Básico"));
        op.put(10, new JLabel("Intermediário"));
        op.put(20, new JLabel("Avançado"));
        
        niveis.setLabelTable(op);
        niveis.setPaintLabels(true);
        niveis.setPaintTicks(true);
        niveis.setSize(250, 50);
        niveis.setLocation(15, 290);
        
        txtInfo = new JLabel("Informações Adicionais:");
        txtInfo.setSize(200, 50);
        txtInfo.setLocation(15, 340);
        
        txAInfo = new JTextArea("", 30, 30);
        scroll = new JScrollPane();
        scroll.setViewportView(txAInfo);
        scroll.setSize(250, 100);
        scroll.setLocation(10, 380);
        
        txtSenha = new JLabel("Senha:");
        txtSenha.setSize(50, 50);
        txtSenha.setLocation(10, 490);
        
        psSenha = new JPasswordField();
        psSenha.setSize(150, 30);
        psSenha.setLocation(60, 500);
        
        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setSize(150, 50);
        
        btnCancelar = new JButton("Cancelar");
        btnCancelar.setSize(150, 50);
        
        cont.add(txtNome);
        cont.add(lblNome);
        
        cont.add(txtIdade);
        cont.add(cbIdade);
        
        cont.add(txtSexo);
        cont.add(rbMasc);
        cont.add(rbFem);
        
        cont.add(txtEnder);
        cont.add(lblEnder);
        
        cont.add(txtNot);
        cont.add(chEdu);
        cont.add(chEco);
        cont.add(chEsp);
        cont.add(chTecno);
        
        cont.add(txtNivel);
        cont.add(niveis);
        
        cont.add(txtInfo);
        cont.add(scroll);
        
        cont.add(txtSenha);
        cont.add(psSenha);
        
        painelLayout = new JPanel();
        painelLayout.setLayout(new FlowLayout(FlowLayout.LEFT));
        painelLayout.setSize(500, 50);
        painelLayout.setLocation(0, 550);
        painelLayout.setBackground(Color.GRAY);
        painelLayout.add(btnCadastrar);
        painelLayout.add(btnCancelar);
        cont.add(painelLayout);
    }
    
    public static void main(String[] args) {
        CadastroUsuario cadastro = new CadastroUsuario();
        cadastro.setVisible(true);
    }
}
