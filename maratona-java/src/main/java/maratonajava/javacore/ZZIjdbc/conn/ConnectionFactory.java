package maratonajava.javacore.ZZIjdbc.conn;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //java.sql = Connection, Statement, ResultSet, DriveManager

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/series_store";
        String userName = "root";
        String password = "root";

        return DriverManager.getConnection(url, userName, password);
    }

    public static JdbcRowSet getJdbcRowSet() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/series_store";
        String userName = "root";
        String password = "root";

        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();

        jdbcRowSet.setUrl(url);
        jdbcRowSet.setUsername(userName);
        jdbcRowSet.setPassword(password);

        return jdbcRowSet;
    }

    public static CachedRowSet getCachedRowSet() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/series_store";
        String userName = "root";
        String password = "root";

        CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();

        cachedRowSet.setUrl(url);
        cachedRowSet.setUsername(userName);
        cachedRowSet.setPassword(password);

        return cachedRowSet;
    }
}
