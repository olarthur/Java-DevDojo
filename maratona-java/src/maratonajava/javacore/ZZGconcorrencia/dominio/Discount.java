package maratonajava.javacore.ZZGconcorrencia.dominio;

public class Discount {
    public enum Code {
        NONE(0), DISCOUNT1(5), DISCOUNT2(10), DISCOUNT3(15);

        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}
