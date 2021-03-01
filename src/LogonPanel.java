import javax.swing.*;

public class LogonPanel extends JFrame {

    private static LogonPanel instance = null;

    public static LogonPanel getInstance()
    {
        if(instance==null)
            instance = new LogonPanel();
        return instance;
    }

    public LogonPanel() {

       /* JFrame login = new JFrame();*/

        add(new MyPanel_Logon());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

    }

}
