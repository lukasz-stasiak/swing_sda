import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyPanel extends JPanel implements ActionListener {
    JButton button, buttonScore;
    JTextField textField, textField2;
    JLabel label, label2, label3;


    public MyPanel() {
        setLayout(null);
        

        label2 = new JLabel("Jest to gra do zgadywania liczb. Będziemy losować liczbę od 1 do 200.");
label2.setBounds(10, 5, 600, 30);
add(label2);

        label3 = new JLabel("Spróbuj odgadnąć w najmniejszej liczbię kroków co to za liczba");
        label3.setBounds(10, 20, 600, 30);
        add(label3);

        textField = new JTextField("Podaj liczbę ");
        textField.setBounds(10, 60, 200, 20);
        add(textField);

        label = new JLabel("test");
        label.setBounds(10, 140, 600, 20);
        add(label);

        button = new JButton("Sprawdź!");
        button.setBounds(10, 90, 150, 30);
        add(button);
        button.addActionListener(this);

        buttonScore = new JButton("Pokaż tabelę wyników");
        buttonScore.setBounds(10, 200, 200, 30);
        add(buttonScore);
        buttonScore.addActionListener(this);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // JOptionPane.showMessageDialog(null, "Hello");
label.setText("hello");

    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 400);
    }




}
