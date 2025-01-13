package maratonajava.javacore.ZZClambdas.dominio;

public class Series {
    private String title;
    private int episodes;

    public Series(String title, int episodes) {
        this.title = title;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Series{" +
                "title='" + title + '\'' +
                ", quantity=" + episodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodes() {
        return episodes;
    }


}
