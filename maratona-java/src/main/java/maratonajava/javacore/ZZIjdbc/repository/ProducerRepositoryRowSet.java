package maratonajava.javacore.ZZIjdbc.repository;

import maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import maratonajava.javacore.ZZIjdbc.dominio.Producer;
import maratonajava.javacore.ZZIjdbc.listener.CustomRowSetListener;

import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProducerRepositoryRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {
        String sql = "SELECT * FROM series_store.producer WHERE name LIKE ?;";

        List<Producer> producers = new ArrayList<>();

        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {

            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute();

            while (jrs.next()) {
                Producer producer = Producer.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("name"))
                        .build();

                producers.add(producer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return producers;
    }

/* SQLException

    public static void updateJdbcRowSet(Producer producer) {
        String sql = "UPDATE `series_store`.`producer` SET `name` = ? WHERE (`id` = ?);";

        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {

            jrs.setCommand(sql);
            jrs.setString(1, producer.getName());
            jrs.setInt(2, producer.getId());
            jrs.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
*/

    public static void updateJdbcRowSet(Producer producer) {
        String sql = "SELECT * FROM series_store.producer WHERE (`id` = ?);";

        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {

            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute();

            if (!jrs.next()) return;
            jrs.updateString("name", producer.getName());
            jrs.updateRow();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
