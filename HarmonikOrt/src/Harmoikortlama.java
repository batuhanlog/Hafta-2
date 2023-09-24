public class Harmoikortlama {
    public static void main(String[] args) {
        double[] dizi = {1.0, 2.0, 3.0, 4.0, 5.0};
        double harmonikOrtalama = hesaplaHarmonikOrtalama(dizi);

        System.out.println("Dizi içindeki sayıların harmonik ortalaması: " + harmonikOrtalama);
    }

    public static double hesaplaHarmonikOrtalama(double[] dizi) {
        double toplamTersleri = 0.0;

        for (double sayi : dizi) {
            toplamTersleri += 1.0 / sayi;
        }

        return dizi.length / toplamTersleri;
    }
}
