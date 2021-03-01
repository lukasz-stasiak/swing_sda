import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

public class TableScore extends JFrame {

    DBScores dbScores = new DBScores();

    public TableScore() {
        JPanel panel = new JPanel();
        panel.add(new JScrollPane(initTable()));

        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
    }

    private JTable initTable(){
        JTable table =  new JTable(buildTableModel(new DBScores().takeScore())) {
            public boolean isCellEditable(int data, int columns) {
                return false;
            }
        };
        table.setPreferredScrollableViewportSize(new Dimension(200, 300));
        table.setFillsViewportHeight(true);
        table.setGridColor(Color.white);
      /*  table.setForeground(Color.white);
        table.setBackground(Color.BLACK);*/
        table.setFont(new Font("Arial", Font.BOLD, 12));
        table.setRowHeight(30);

      //  table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
        TableColumnModel model = table.getColumnModel();
        model.getColumn(0).setPreferredWidth(170);
       table.setColumnModel(model);

        return table;
    }



//Tworzy model tabeli
    public static DefaultTableModel buildTableModel(ResultSet rs) {

        ResultSetMetaData metaData;
        Vector<String> columnNames = null;
        Vector<Vector<Object>> data = null;
        try {
            metaData = rs.getMetaData();

            // names of columns
            columnNames = new Vector<String>();
            int columnCount = metaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++) {
                columnNames.add(metaData.getColumnName(column));
            }

            // data of the table
            data = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> vector = new Vector<Object>();
                for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                    vector.add(rs.getObject(columnIndex));
                }
                data.add(vector);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return new DefaultTableModel(data, columnNames);

    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 500);
    }

}
