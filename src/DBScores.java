import java.sql.Array;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBScores extends DBConnection {


    public ResultSet takeScore() {

        try {
            /*System.out.println("hello");*/
            connectDb();
            String sql = "SELECT name as User, score as Score from Users ORDER BY score ASC";
            ResultSet rs = stmt.executeQuery(sql);
            disconnectDB();
            return rs;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean showUser(String name) {

        try {
            connectDb();
            String query = "SELECT * FROM Users where name ='" + name + "';";
            ResultSet rs = stmt.executeQuery(query);
            disconnectDB();
            return rs.next();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return false;
    }

    public void wyswietl() {
        System.out.println("Wyswietlam tabele");

        String query = "SELECT * FROM Users;";

        try {
            connectDb();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnCounter = rsmd.getColumnCount();

                StringBuilder result = new StringBuilder();

                for (int i = 1; i <= columnCounter; i++)
                    result = result.append(rsmd.getColumnName(i) + ": " + rs.getString(i) + "\t");
                result.append("\n");

                System.out.println(result.toString());
            }
            disconnectDB();
        } catch (ClassNotFoundException e) {
            System.err.println("Driver error " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL error " + e.getMessage());
        }
    }

    public void updateScore(String user, int score) {
        try {
            connectDb();

            prepStmt = conn.prepareStatement("UPDATE Users SET score = ? where name= ?");

            prepStmt.setInt(1, score);
            prepStmt.setString(2, user);

            prepStmt.executeUpdate();
            disconnectDB();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        new DBScores().wyswietl();
    }

}
