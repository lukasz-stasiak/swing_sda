import java.sql.ResultSet;
import java.sql.SQLException;

public class DBScores extends DBConnection{

    public ResultSet takeScore() {

        try {
            System.out.println("hello");
            connectDb();
            String sql = "SELECT * from Users";
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

}
