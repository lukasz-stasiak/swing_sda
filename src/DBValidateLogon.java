import java.sql.ResultSet;
import java.sql.SQLException;

public class DBValidateLogon extends DBConnection{

    public boolean checkUsers(String login, String pass) {

        try {

            connectDb();
            String query = "SELECT * FROM Users WHERE name='" + login + "' AND password='" + pass + "';";
            ResultSet rs = stmt.executeQuery(query);
            disconnectDB();
            return rs.next();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;

    }
}
