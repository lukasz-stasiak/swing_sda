import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;

public class AddNewUser extends DBConnection {


    public AddNewUser(String login, String password) {

        try {
            connectDb();

            prepStmt = conn.prepareStatement("INSERT INTO Users (name, password) VALUES (?, ?)");

            prepStmt.setString(1, login);
            prepStmt.setString(2, password);

            prepStmt.executeUpdate();
            disconnectDB();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        new DBScores().wyswietl();
    }

}
