package maratonajava.javacore.ZZJcrud.repository;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import maratonajava.javacore.ZZJcrud.dominio.Producer;
import maratonajava.javacore.ZZJcrud.dominio.Series;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class SeriesRepository {
    public static List<Series> findByName(String name) {
        log.info("Finding Series by name '{}'", name);

        List<Series> series = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .name(rs.getString("producer_name"))
                        .id(rs.getInt("producer_id"))
                        .build();

                Series serie = Series
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();

                series.add(serie);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all series ", e);
        }

        return series;
    }

    private static PreparedStatement createPrepareStatementFindByName(Connection conn, String name)
            throws SQLException {

        String sql = """
                SELECT s.id, s.name, s.episodes, s.producer_id, p.name as 'producer_name' FROM series_store.series s inner join
                series_store.producer p on s.producer_id = p.id WHERE s.name LIKE ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static void delete(int id) {

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementDelete(conn, id)) {

            ps.execute();
            log.info("Deleted series '{}' from the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete series '{}'", id, e);
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection conn, Integer id)
            throws SQLException {

        String sql = "DELETE FROM `series_store`.`series` WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Series serie) {
        log.info("Saving Series '{}'", serie);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementSave(conn, serie)) {

            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update series '{}'", serie.getId(), e);
        }
    }

    private static PreparedStatement createPrepareStatementSave(Connection conn, Series serie)
            throws SQLException {
        String sql = "INSERT INTO `series_store`.`series` (`name`, `episodes`, `producer_id`) VALUES ( ?, ?, ?);";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, serie.getName());
        ps.setInt(2, serie.getEpisodes());
        ps.setInt(3, serie.getProducer().getId());
        return ps;
    }

    public static Optional<Series> findById(Integer id) {
        log.info("Finding Series by id '{}'", id);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery();) {

            if (!rs.next()) return Optional.empty();

            Producer producer = Producer.builder()
                    .name(rs.getString("producer_name"))
                    .id(rs.getInt("producer_id"))
                    .build();

            Series serie = Series
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build();

            return Optional.of(serie);
        } catch (SQLException e) {
            log.error("Error while trying to find all series ", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPrepareStatementFindById(Connection conn, Integer id)
            throws SQLException {

        String sql = """
                SELECT s.id, s.name, s.episodes, s.producer_id, p.name as 'producer_name' FROM series_store.series s
                inner join series_store.producer p on s.producer_id = p.id WHERE s.id = ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void update(Series serie) {
        log.info("Updating serie '{}'", serie);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementUpdate(conn, serie)) {

            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update series '{}'", serie.getId(), e);
        }
    }

    private static PreparedStatement createPrepareStatementUpdate(Connection conn, Series serie)
            throws SQLException {

        String sql = "UPDATE `series_store`.`series` SET `name` = ?, `episodes` = ? WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, serie.getName());
        ps.setInt(2, serie.getEpisodes());
        ps.setInt(3, serie.getId());
        return ps;
    }
}
