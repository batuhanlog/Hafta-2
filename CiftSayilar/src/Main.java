import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] sayiDizisi = {2, 3, 4, 4, 6, 8, 8, 10, 10, 12, 12};


        Map<Integer, Integer> tekrarlar = new HashMap<>();

        for (int sayi : sayiDizisi) {

            if (sayi % 2 == 0) {

                tekrarlar.put(sayi, tekrarlar.getOrDefault(sayi, 0) + 1);
            }
        }


        System.out.println("Çift Sayılar ve Tekrar Sayıları:");
        for (Map.Entry<Integer, Integer> entry : tekrarlar.entrySet()) {
            System.out.println(entry.getKey() + " tekrar ediyor: " + entry.getValue() + " kez");
        }
    }
}
