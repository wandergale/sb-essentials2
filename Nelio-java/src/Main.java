import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.printf("%s tem %d anos de idade%n", nome, idade);
        char sexo = sc.next().charAt(0);
        System.out.printf("%s tem %d anos de idade e é do sexo %s", nome, idade, sexo);

        sc.close();
    }

}
