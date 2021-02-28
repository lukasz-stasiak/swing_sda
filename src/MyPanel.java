import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel{// implements ActionListener{
    JList<String> lista;
    DefaultListModel<String> model; // tutaj przygotowuje i pozniej dodaje
    JTextField input;

//    class Akcja implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            model.addElement(input.getText());
//            input.setText("");
//        }
//    }

    public MyPanel() {
        setLayout(null);
        model = new DefaultListModel<String>();
        lista = new JList<String>();
        lista.setModel(model);

        JScrollPane scrollPane = new JScrollPane(lista);
        scrollPane.setBounds(10, 10, 480, 350);
        add(scrollPane);

        input = new JTextField();
        input.setBounds(180, 410, 150, 20);
        add(input);


        JButton klawisz = new JButton("Kliknij mnie!");
        klawisz.setBounds(180, 440, 150, 20);
//        klawisz.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                model.addElement(input.getText());
//                input.setText("");
//            }
//        });

        klawisz.addActionListener(e -> { // wyrazenie lambda
            model.addElement(input.getText());
            input.setText("");
        });
        add(klawisz);
    }


    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        model.addElement(input.getText());
//        input.setText("");
//    }
}
