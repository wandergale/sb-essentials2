import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double n = 12.2312541;
        String nome = "Wanderson";
        int idade = 21;
        double renda = 5000;

        System.out.printf("%.2f%n", n);
        System.out.printf("Resultado = %.2f Metros%n", n);
        System.out.printf("%s tem %d anos e renda de R$ %.2f reais%n", nome, idade, renda);

        int a = 5;
        int b = 2;
        double result = (double) a / b; // sem o (double) o resultado seria 2.0 ou seja errado.
        System.out.println(result);
    }

}
