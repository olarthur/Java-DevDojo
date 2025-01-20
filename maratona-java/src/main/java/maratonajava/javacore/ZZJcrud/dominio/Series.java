package maratonajava.javacore.ZZJcrud.dominio;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Series {
    Integer id;
    String name;
    int episodes;
    Producer producer;
}
