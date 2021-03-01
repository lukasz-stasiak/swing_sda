import javax.swing.*;
import java.awt.*;

public class GamePanel extends JFrame {


    private static GamePanel instance = null;

    public static GamePanel getInstance()
    {
        if(instance==null)
            instance = new GamePanel();
        return instance;
    }

   /* JFrame window = new JFrame();*/

    public GamePanel() {
        add(new MyPanel());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

}
