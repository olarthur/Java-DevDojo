package maratonajava.javacore.ZZJcrud.service;

import maratonajava.javacore.ZZJcrud.dominio.Producer;
import maratonajava.javacore.ZZJcrud.dominio.Series;
import maratonajava.javacore.ZZJcrud.repository.SeriesRepository;

import java.util.Optional;
import java.util.Scanner;

public class SeriesService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();

        SeriesRepository.findByName(name)
                .forEach(p ->
                        System.out.printf("[%d] - %s %d %s%n",
                                p.getId(), p.getName(), p.getEpisodes(), p.getProducer().getName()));

    }

    private static void delete() {
        System.out.println("Type the id of the series you want to delete");

        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");

        String choice = SCANNER.nextLine();

        if ("y".equalsIgnoreCase(choice)) {
            SeriesRepository.delete(id);
        }

    }

    private static void save() {
        System.out.println("Type the name of the series");
        String name = SCANNER.nextLine();

        System.out.println("Type the number of episodes");
        int episodes = Integer.parseInt(SCANNER.nextLine());

        System.out.println("Type the id of the producer");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());

        Series series = Series.builder()
                .episodes(episodes)
                .name(name)
                .producer(Producer.builder().id(producerId).build())
                .build();

        SeriesRepository.save(series);
    }

    private static void update() {
        System.out.println("Type the id of the object you want to update");

        Optional<Series> serieOptional = SeriesRepository.findById(Integer.parseInt(SCANNER.nextLine()));

        if (serieOptional.isEmpty()) {
            System.out.println("Serie not found");
            return;
        }

        Series seriesFromDb = serieOptional.get();
        System.out.println("Series found " + seriesFromDb);
        System.out.println("Type the new name or enter to keep the same");

        String name = SCANNER.nextLine();
        name = name.isEmpty() ? seriesFromDb.getName() : name;

        System.out.println("Type the new number of episodes");
        int episodes = Integer.parseInt(SCANNER.nextLine());

        Series seriesToUpdate = Series.builder()
                .id(seriesFromDb.getId())
                .episodes(episodes)
                .producer(seriesFromDb.getProducer())
                .name(name)
                .build();

        SeriesRepository.update(seriesToUpdate);
    }
}
