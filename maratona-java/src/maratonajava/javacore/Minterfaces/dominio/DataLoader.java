package maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();

    default void checkPermission(){
        System.out.println("Checando permissões");
    }
}
