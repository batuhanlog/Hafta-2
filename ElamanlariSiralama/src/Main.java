import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];

        System.out.println("Dizi elemanlarını girin:");

        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(dizi);

        System.out.println("Dizi küçükten büyüğe sıralandı:");

        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
    }
}
