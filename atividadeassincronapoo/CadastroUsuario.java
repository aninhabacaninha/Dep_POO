package atividadeassincronapoo;

import java.awt.Container;
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
        txtNome.setSize(50, 50); //altura, largura
        txtNome.setLocation(15, 5); //x, y
        
        lblNome = new JTextField();
        lblNome.setSize(150, 30);
        lblNome.setLocation(70, 15);
        
        txtIdade = new JLabel("Idade: ");
        txtIdade.setSize(50, 50);
        txtIdade.setLocation(15, 50);
        
        cbIdade = new JComboBox();
        cbIdade.setSize(150, 30);
        cbIdade.setLocation(70, 15);
        
        txtSexo = new JLabel("Sexo: ");
        txtSexo.setSize(50, 50);
        txtSexo.setLocation(15, 90);
        
        rbMasc = new JRadioButton("Masculino");
        rbFem = new JRadioButton("Feminino");
        
        txtEnder = new JLabel("Endereço: ");
        txtEnder.setSize(50, 50);
        txtEnder.setLocation(15, 120);
        
        Container cont = getContentPane();
        cont.setLayout(null);
        cont.add(txtNome);
        cont.add(lblNome);
        cont.add(txtIdade);
        cont.add(cbIdade);
        cont.add(txtSexo);
        cont.add(rbMasc);
        cont.add(rbFem);
    }
    
    public static void main(String[] args) {
        CadastroUsuario cadastro = new CadastroUsuario();
        cadastro.setVisible(true);
    }
}
