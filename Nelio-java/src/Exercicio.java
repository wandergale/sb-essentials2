import java.util.Locale;

public class Exercicio {

    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 21;
        int code = 1234;
        char gender = 'M';

        double price1 = 4000;
        double price2 = 1500;
        double measure = 53.13231;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);

        System.out.println();

        System.out.printf("Record: %d years old, code %d and gender %s%n", age, code, gender);

        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }

}
