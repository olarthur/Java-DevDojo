package maratonajava.javacore.ZZIjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //java.sql = Connection, Statement, ResultSet, DriveManager

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/series_store";
        String userName = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
