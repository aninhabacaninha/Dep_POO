package aula2106;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class Tarefa3 extends JFrame {
    public Tarefa3() {
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        g.setColor(Color.blue);
        int x, y;
        x = 50;
        final int passo = 10;
        
        for(y = 350; y >= 50; y -= passo) {
            x += passo;
            g.drawLine(x, 50, 50, y);
            
            try {
                Thread.sleep(100);
            } catch(InterruptedException ex) {}
        }
    }
    
    public static void main(String[] args) {
        Tarefa3 tarefa = new Tarefa3();
        tarefa.setVisible(true);
    }
}
