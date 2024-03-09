//Demonstração de cores em um array

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbbow extends JPanel{

    //Define as cores indogo e violeta
    
    private final static Color VIOLET = new Color(128,0,128);
    private final static Color INDIGO = new Color(75,0,130);

    //a utilizar as cores iniciando da parte interna 
    //duas entradas em branco resultam em um arco vazio no centro

    private Color[] colors = {Color.WHITE,Color.WHITE,VIOLET,INDIGO,Color.BLUE,
    Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED };
    private int counter;

    public DrawRainbbow(){
        setBackground(Color.WHITE);//Configura o fundo como branco
    }
    //desenha um arco iris ultilizandi arcos concentricos
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int radius = 20;//raio de um arco

        //desenha pertop da parte central inferior
        int centerX = getWidth()/2;
        int centerY = getHeight()-10;

        //faz arcos preenchidos com o mais externo
        for (int counter = colors.length; counter > 0; counter--);

        {
            //configura a cor para o arco atual
            g.setColor(colors[ counter - 1 ]);

            //ptrencher de 9 a 180 graus
            g.fillArc(centerX - counter * radius, 
            centerY - counter * radius,
            counter * radius * 2,counter *radius * 2,0,180);
            
        }


    }
}
