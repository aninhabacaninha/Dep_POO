package aula2106;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.JFrame;

public class Tarefa4 extends JFrame {
    public Circulo circulo;
    
    public Tarefa4() {
        setTitle("Círculozinho");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int x = (int) Math.floor(Math.random()*400);
        int y = (int) Math.floor(Math.random()*350);
        circulo = new Circulo(x, y, 15);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        g.setColor(Color.BLUE);
        
        int x = circulo.getX() - circulo.getRaio();
        int y = circulo.getY() - circulo.getRaio();
        int altura = circulo.getRaio() * 2;
        int largura = circulo.getRaio() * 2;
        
        g.fillOval(x, y, altura, largura);
    }
    
    public static void main(String[] args) {
        Tarefa4 tarefa = new Tarefa4();
        tarefa.setVisible(true);
    }
}
