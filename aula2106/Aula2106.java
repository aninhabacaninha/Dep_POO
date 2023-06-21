package aula2106;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;

public class Aula2106 extends JFrame {
    
    public Aula2106() {
       setSize(400, 350);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //rgb (red green blue)
        g.setColor(new Color(255, 0, 0));
        //coordenadas para linha (x, y, altura, largura)
        g.drawLine(10, 50, 390, 50);
        //circulo
        g.drawOval(50, 100, 75, 75);
        //circulo preenchido
        g.fillOval(150, 100, 75, 75);
        //retangulo com borda redonda (x, y, altura, largura, tamanho da borda)
        g.drawRoundRect(50, 200, 100, 100, 40, 40);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC, 16));
        g.drawString("Minha janelinha é tão bonitinha heuheuheu", 10, 45);
    }
    
    public static void main(String[] args) {
       Aula2106 janela = new Aula2106();
       janela.setVisible(true);
    }
}
