package maratonajava.javacore.ZZIjdbc.test;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZIjdbc.dominio.Producer;
import maratonajava.javacore.ZZIjdbc.service.ProducerServiceRowSet;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(2).name("epicuro").build();
        ProducerServiceRowSet.updateJdbcRowSet(producerToUpdate);
        log.info("------------------------------");

        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
        log.info(producers);
    }
}
