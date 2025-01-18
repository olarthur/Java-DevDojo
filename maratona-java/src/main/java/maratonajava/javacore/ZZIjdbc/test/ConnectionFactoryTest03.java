package maratonajava.javacore.ZZIjdbc.test;

import maratonajava.javacore.ZZIjdbc.dominio.Producer;
import maratonajava.javacore.ZZIjdbc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("Toei").build();
        Producer producer2 = Producer.builder().name("ABC").build();
        Producer producer3 = Producer.builder().name("Netflix").build();

        ProducerService.saveTransaction(List.of(producer1, producer2, producer3));
    }
}
