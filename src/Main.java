import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Digite um número de 1 a 10: ");

        int aleatorio = rand.nextInt(1, 10);
        System.out.println(aleatorio);

        int pessoa1 = sc.nextInt();

        if (pessoa1 < 1 || pessoa1 > 10) {
            System.out.println("Número invalido.");
        }

        while (pessoa1 != aleatorio) {
            System.out.println("Escapou! Digite outro número");
            pessoa1 = sc.nextInt();
        }
        System.out.println("Bang! Você morreu.");

        sc.close();
    }
}