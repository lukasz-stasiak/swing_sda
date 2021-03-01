import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyPanel_Logon extends JPanel  {
    JButton login, registry;
    JTextField textLogin;
    JPasswordField textPass;
    DBValidateLogon validate;

    public MyPanel_Logon() {
        setLayout(null);
        setBackground(Color.CYAN);
        validate = new DBValidateLogon();

        textLogin = new JTextField();
        textLogin.setBounds(150, 20, 200, 30);
        textLogin.setFont(new Font("Arial", Font.BOLD, 15));
        add(textLogin);

        textPass = new JPasswordField();
        textPass.setBounds(150, 70, 200, 30);
        textPass.setFont(new Font("Arial", Font.BOLD, 15));
        add(textPass);

        login = new JButton("Login");
        login.setBounds(150, 120, 100, 30);
        add(login);
        login.addActionListener(e -> {
            if (validate.checkUsers(textLogin.getText(),textPass.getText())) {
                StoreLogin.getInstance().setLogin(textLogin.getText());
                GamePanel.getInstance();
                LogonPanel.getInstance().setVisible(false);
                GamePanel.getInstance().setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Użytkownik nie istnieję. Spróbuj się zarejestrować");
            }
            DBScores wyswietlDB = new DBScores();
            wyswietlDB.wyswietl();
        });

        registry = new JButton("Rejestracja");
        registry.setBounds(250, 120, 100, 30);
        add(registry);
        registry.addActionListener(e -> {
            new AddNewUser(textLogin.getText(), textPass.getText());
            DBScores wyswietlDB = new DBScores();
            wyswietlDB.wyswietl();
        });



    }

   /* @Override
    public void actionPerformed(ActionEvent e) {
        // JOptionPane.showMessageDialog(null, "Hello");
        String login2 = textLogin.getText();
        String pass = textPass.getText();

        //REJESTRACJA
   *//*     if (registry.isSelected()) {
            new AddNewUser(textLogin.getText(), textPass.getText());
        }*//*

        //LOGOWANIE
*//*       if (login.isSelected()) {
           if (validate.checkUsers(textLogin.getText(),textPass.getText())) {
               GamePanel.getInstance();
               LogonPanel.getInstance().dispose();
           } else {
               JOptionPane.showMessageDialog(null, "Użytkownik nie istnieję. Spróbuj się zarejestrować");
           }
       }*//*

        DBScores wyswietlDB = new DBScores();
        wyswietlDB.wyswietl();

    }*/

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 300);
    }


}

