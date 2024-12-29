package maratonajava.javacore.Ycolecoes.dominio;

public class Smatphone {
    private String serialNumber;
    private String marca;

    public Smatphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    /*
     Reflexivo: x.equals(x) tem que ser 'true' para tudo que for diferente de null
     Simétrico: para x e y diferente de null, se x.equals(y) == true logo, y.equals(x) == true
     Transitividade: para x, y, z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals.(z) == true
     Consistente: x.equals(x) sempre retorna true se x for diferente de null
     para x diferente de null, x.equals(null) retornar false
    */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smatphone smatphone = (Smatphone) obj;
        return serialNumber != null && serialNumber.equals(smatphone.serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
