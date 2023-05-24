package exemplopacote;

import exemplopacote.model.Dependente;
import javax.swing.JOptionPane;

public class depPOO_ExemploPacote {
    public static void main(String[] args) {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu código: "));
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        
        Dependente dependente = new Dependente(codigo, nome, idade);
        String mensagem = "Código: " + codigo + "\n" + "Nome: " + dependente.getNome() + "\n" + "Idade: " + dependente.getIdade();
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
