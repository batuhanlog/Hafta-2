import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};


        Map<Integer, Integer> frekanslar = new HashMap<>();

        for (int eleman : dizi) {

            if (frekanslar.containsKey(eleman)) {
                frekanslar.put(eleman, frekanslar.get(eleman) + 1);
            } else {

                frekanslar.put(eleman, 1);
            }
        }


        System.out.println("Tekrar Sayıları");
        for (Map.Entry<Integer, Integer> entry : frekanslar.entrySet()) {
            System.out.println(entry.getKey() + " sayısı " + entry.getValue() + " kere tekrar edildi.");
        }
    }
}
