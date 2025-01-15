package maratonajava.javacore.ZZIjdbc.dominio;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value // torna a classe imutavel
@Builder // cria o builder da classe
public class Producer {
    private Integer id;
    private String name;
}
