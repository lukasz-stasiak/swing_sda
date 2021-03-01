import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


class MyPanel extends JPanel implements ActionListener {
    JButton button, buttonScore;
    JTextField textField, textField2;
    JLabel label, label2, label3, label4;


    int hit;
    int iloscTrafien = 1;

    Random r = new Random();
    int x = r.nextInt(201);

  /*  int x = 2;*/


    public MyPanel() {
        setLayout(null);
        

        label2 = new JLabel("Jest to gra do zgadywania liczb. Będziemy losować liczbę od 1 do 200.");
        label2.setBounds(10, 5, 600, 30);
        add(label2);

        label3 = new JLabel("Spróbuj odgadnąć w najmniejszej liczbię kroków co to za liczba");
        label3.setBounds(10, 20, 600, 30);
        add(label3);


        label4 = new JLabel("Podaj liczbę od 1 do 200");
        label4.setBounds(10, 60, 600, 30);
        add(label4);

        textField = new JTextField();
        textField.setBounds(170, 70, 200, 20);
        add(textField);

        label = new JLabel("Tutaj pokaże się wynik");
        label.setBounds(10, 140, 600, 20);
        add(label);

        button = new JButton("Sprawdź!");
        button.setBounds(60, 110, 150, 30);
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

//zamiana na int i przekazywanie liczby z pola do metody
int liczba = Integer.parseInt(textField.getText());

        if (liczba == x) {
            label.setText("ZGADŁEŚ GRATULACJE!! trafienie nastąpiło po: " + iloscTrafien + " strzałów");


        } else if (liczba > x) {
            label.setText("Niestety strzał chybiony, poszukiwana liczba jest MNIEJSZA od"  + liczba + ". Podaj kolejny strzał");

            iloscTrafien++;
        } else {

            label.setText("Niestety strzał chybiony, poszukiwana liczba jest WIĘKSZA od " + liczba + ".  Podaj kolejny strzał");
            iloscTrafien++;
        }

/*DBScores takeScores = new DBScores();
takeScores.showUser("Jan");*/
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 400);
    }




}

