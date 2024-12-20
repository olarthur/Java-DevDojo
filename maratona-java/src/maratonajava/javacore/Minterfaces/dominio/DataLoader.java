package maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission(){
        System.out.println("Checando permissões");
    }

    public static void retriveDataSize() {
        System.out.println("Retrive Data Size interface");
    }
}
