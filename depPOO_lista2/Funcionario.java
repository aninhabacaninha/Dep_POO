package depPOO_lista2;

public class Funcionario {
   int codigo;
   String nome, cargo;
   double salario;
    
   public void aumentarSalarioPorTempoDeServico() {
        salario = salario * (5/100);
   }
    
   public void aumentarSalario(double taxa) {
        salario = salario * (taxa/100);
   }
}
