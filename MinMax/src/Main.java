import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int girilenSayi = 5;

        int minKucukEnYakin = Integer.MAX_VALUE;
        int maxBuyukEnYakin = Integer.MIN_VALUE;

        for (int i : list) {
            if (i < girilenSayi && girilenSayi - i < girilenSayi - minKucukEnYakin) {
                minKucukEnYakin = i;
            }
            if (i > girilenSayi && i - girilenSayi < maxBuyukEnYakin - girilenSayi) {
                maxBuyukEnYakin = i;
            }
        }

        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Girilen Sayı : " + girilenSayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minKucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxBuyukEnYakin);
    }
}
