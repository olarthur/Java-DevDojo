package maratonajava.javacore.ZZClambdas.service;

import maratonajava.javacore.ZZClambdas.dominio.Series;

public class SeriesComparators {
    public static int compareByTitle(Series s1, Series s2) {
        return s1.getTitle().compareTo(s2.getTitle());
    }

    public static int compareByEpisodes(Series s1, Series s2) {
        return Integer.compare(s1.getEpisodes(), s2.getEpisodes());
    }

    public int compareByEpisodesNonStatic(Series s1, Series s2) {
        return Integer.compare(s1.getEpisodes(), s2.getEpisodes());
    }
}
