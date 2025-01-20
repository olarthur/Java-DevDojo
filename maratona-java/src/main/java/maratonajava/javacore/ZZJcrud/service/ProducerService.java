package maratonajava.javacore.ZZJcrud.service;

import maratonajava.javacore.ZZJcrud.dominio.Producer;
import maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1:
                findByName();
                break;
            case 2:
                delete();
                break;
            default:
                throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");

        String name = SCANNER.nextLine();

        List<Producer> producers = ProducerRepository.findByName(name);

        for (int i = 0; i < producers.size(); i++) {
            Producer producer = producers.get(i);
            System.out.printf("[%d] - %d | %s%n", i, producer.getId(), producer.getName());
        }
    }

    private static void delete() {
        System.out.println("Type the id of the producer you want to delete");

        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");

        String choice = SCANNER.nextLine();

        if ("y".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }

    }
}
