package atividadeassincrona;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CadastroUsuario extends JFrame {
    JLabel txtNome, txtIdade, txtSexo, txtEnder;
    JTextField lblNome, lblEnder;
    JComboBox cbIdade;
    JRadioButton rbMasc, rbFem;
    JPasswordField psSenha;
    
    public CadastroUsuario() {
        setTitle("Formulário de Cadastro de Usuário");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        txtNome = new JLabel("Nome: ");
        txtNome.setSize(50, 50);
        txtNome.setLocation(15, 5);
        
        lblNome = new JTextField();
        lblNome.setSize(150, 30);
        lblNome.setLocation(70, 15);
        
        txtIdade = new JLabel("Idade: ");
        txtIdade.setSize(50, 50);
        txtIdade.setLocation(15, 50);
        
        String[] cb = new String[]{"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
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
        
        Container cont = getContentPane();
        cont.setLayout(null);
        cont.add(txtNome);
        cont.add(lblNome);
        cont.add(txtIdade);
        cont.add(cbIdade);
        cont.add(txtSexo);
        cont.add(rbMasc);
        cont.add(rbFem);
        cont.add(txtEnder);
    }
    
    public static void main(String[] args) {
        CadastroUsuario cadastro = new CadastroUsuario();
        cadastro.setVisible(true);
    }
}