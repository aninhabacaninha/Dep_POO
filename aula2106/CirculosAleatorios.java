package aula2106;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class CirculosAleatorios extends JFrame {
    public CirculosAleatorios() {
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        int x, y;
        int largura = 50;
        int altura = 50;
        
        for(int i = 0; i <= 20; i++) {
            x = (int) (Math.random() * 300) +1;
            //floor arrendonda doubles para inteiros para baixo
            //x = (int) Math.floor(Math.random() * 400);
            
            if(x + largura > 400){
                x = 400 - largura;
            }
            
            y = (int) (Math.random() * 250) +1;
            //y = (int) Math.floor(Math.random() * 350);
            
            if(y + altura > 350) {
                y = 350 - altura;
            }
            
            g.drawOval(x, y, altura, largura);
            
            try{
                Thread.sleep(100);
            } catch (InterruptedException ex) {}
        }
    }

    public static void main(String[] args) {
        CirculosAleatorios circ = new CirculosAleatorios();
        circ.setVisible(true);
    }
}
