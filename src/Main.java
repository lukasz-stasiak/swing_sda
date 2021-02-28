import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();

        window.add(new MyPanel());
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();


    }
}
