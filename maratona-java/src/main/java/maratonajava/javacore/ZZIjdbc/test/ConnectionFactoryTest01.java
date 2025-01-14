package maratonajava.javacore.ZZIjdbc.test;

import maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import maratonajava.javacore.ZZIjdbc.dominio.Producer;
import maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder().name("Epicuro").build();
        ProducerRepository.save(producer);
    }
}
