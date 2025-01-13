package maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    // Modificadores de acessso: private > default > protected > public

    @Override
    public void load() {
        System.out.println("Carregando dados do BD");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do BD");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no BD");
    }

    public static void retriveDataSize() {
        System.out.println("Retrive Data Size DataBaseLoader");
    }
}
