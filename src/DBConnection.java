import java.sql.*;

public abstract class DBConnection {

    protected static final String JDBC_DRIVER = "org.postgresql.Driver";
    protected static final String URL = "jdbc:postgresql://localhost/Game";
    protected static final String LOGIN = "postgres";
    protected static final String PASSWORD = "11111";

    protected Statement stmt;
    protected Connection conn;
    protected PreparedStatement prepStmt;

    protected void connectDb() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(URL, LOGIN, PASSWORD);
        stmt = conn.createStatement();
    }

    protected void disconnectDB() throws SQLException {
        stmt.close();
        conn.close();
    }

}
