import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


class MyPanel extends JPanel implements ActionListener {
    JButton button, buttonScore;
    JTextField textField, textField2, textValid;
    JLabel label, label2, label3, label4;
    JTextArea textArea;


    int hit;
    int iloscTrafien = 1;

  /*  Random r = new Random();
    int x = r.nextInt(201);*/

    int x = 2;


    public MyPanel() {
        setLayout(null);
setBackground(Color.CYAN);

        label2 = new JLabel("Jest to gra do zgadywania liczb. Będziemy losować liczbę od 1 do 200.");
        label2.setBounds(10, 5, 600, 30);
        label2.setFont(new Font("Arial", Font.BOLD, 15));
        add(label2);

        label3 = new JLabel("Spróbuj odgadnąć w najmniejszej liczbię kroków co to za liczba");
        label3.setBounds(10, 24, 600, 30);
        label3.setFont(new Font("Arial", Font.BOLD, 15));
        add(label3);


        label4 = new JLabel("Podaj liczbę od 1 do 200:");
        label4.setBounds(10, 70, 600, 30);
        label4.setFont(new Font("Arial", Font.BOLD, 14));
        add(label4);

        label= new JLabel();
        label.setBounds(250, 90, 200, 30);
        add(label);

        textField = new JTextField();
        textField.setBounds(190, 70, 200, 30);
        textField.setFont(new Font("Arial", Font.BOLD, 15));
        add(textField);

   /*     textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                try {
                    int in = Integer.parseInt(textField.getText());
                    label.setText("");
                }catch (NumberFormatException e1) {
                    label.setText("Podaj wartość liczbową");

                }
            }
        });*/



        textArea = new JTextArea("Tutaj pokaże się wynik");
        textArea.setBounds(10, 150, 600, 50);
        textArea.setFont(new Font("Arial", Font.BOLD, 15));
        textArea.setLineWrap(true);
        textArea.setBackground(null);
        add(textArea);

        button = new JButton("Sprawdź!");
        button.setBounds(60, 110, 150, 30);
        add(button);
        button.addActionListener(this);

        buttonScore = new JButton("Pokaż tabelę wyników");
        buttonScore.setBounds(10, 220, 200, 30);
        add(buttonScore);
        buttonScore.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // JOptionPane.showMessageDialog(null, "Hello");

//zamiana na int i przekazywanie liczby z pola do metody
int liczba = Integer.parseInt(textField.getText());

        if (liczba == x) {
            textArea.setText("BRAWO!! Trafiłeś po: " + iloscTrafien + " strzałach");
            setBackground(Color.YELLOW);
            iloscTrafien=1;
            textField.setText("");

            //MESSAGE BOX
            int response = JOptionPane.showConfirmDialog(null,
                    "Zapisać wynik?", "Wybierz opcje...",JOptionPane.YES_NO_OPTION);
            if (response ==  JOptionPane.YES_NO_OPTION) {
                System.out.println("Zapisano wynik");
                setBackground(Color.CYAN);
            } else if (response == JOptionPane.NO_OPTION) {
                System.out.println("Nie zapisano wyniku");
                setBackground(Color.CYAN);
            } else if (response == JOptionPane.CLOSED_OPTION) {
                System.out.println("Nie zapisano wyniku. CANCEL");
                setBackground(Color.CYAN);
            }
       /*     // 0=yes, 1=no, 2=cancel
            System.out.println(response);*/


        } else if (liczba > x) {
            textArea.setText("Niestety strzał chybiony, poszukiwana liczba jest MNIEJSZA od "  + liczba + ".\n Podaj kolejny strzał");

            iloscTrafien++;
        } else {

            textArea.setText("Niestety strzał chybiony, poszukiwana liczba jest WIĘKSZA od " + liczba + ".\n Podaj kolejny strzał");
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

