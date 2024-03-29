import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] sayiDizisi = {2, 3, 4, 4, 6, 8, 8, 10, 10, 12, 12};

        // Çift sayıları ve tekrarlarını saymak için bir Map kullanalım
        Map<Integer, Integer> tekrarlar = new HashMap<>();

        for (int sayi : sayiDizisi) {
            // Eğer sayı çiftse
            if (sayi % 2 == 0) {
                // Map'te bu sayının tekrarını arttıralım
                tekrarlar.put(sayi, tekrarlar.getOrDefault(sayi, 0) + 1);
            }
        }

        // Sonuçları ekrana yazdır
        System.out.println("Çift Sayılar ve Tekrar Sayıları:");
        for (Map.Entry<Integer, Integer> entry : tekrarlar.entrySet()) {
            System.out.println(entry.getKey() + " tekrar ediyor: " + entry.getValue() + " kez");
        }
    }
}
