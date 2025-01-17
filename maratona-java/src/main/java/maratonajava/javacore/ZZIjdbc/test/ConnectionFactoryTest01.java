package maratonajava.javacore.ZZIjdbc.test;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZIjdbc.dominio.Producer;
import maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import maratonajava.javacore.ZZIjdbc.service.ProducerService;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("HBO Studios").build();
        Producer producerToUpdate = Producer.builder().id(17).name("HBO").build();

/*
        ProducerService.save(producer);
        ProducerService.delete(3);
        ProducerService.update(producerToUpdate);
        List<Producer> producers = ProducerService.findAll();
        List<Producer> producers = ProducerService.findByName("Show");
        log.info("Producers found '{}'", producers);
*/
        ProducerService.showProducerMetadata();

/*
        log.info("INFO");
        log.debug("DEBUG");
        log.warn("WARN");
        log.error("ERROR");
        log.trace("TRACE");
*/
    }
}
