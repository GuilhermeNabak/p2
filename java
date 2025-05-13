import java.util.Scanner;
import java.util.Arrays;

public class OrdenaStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpa a quebra de linha

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        Arrays.sort(strings); // Ordena em ordem alfabética

        System.out.println("\nStrings em ordem alfabética:");
        for (String s : strings) {
            System.out.println(s);
        }

        scanner.close();
    }
}
