import javax.swing.JFrame;
//aplicativo de teste para o arco iris 

public class DrawRainbowTest {

    public static void main(String[] args) {
        DrawRainbbow panel = new DrawRainbbow();
        JFrame aplication = new JFrame();

        aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplication.add(panel);
        aplication.setSize(400, 250);
        aplication.setVisible(true);

    }
}
