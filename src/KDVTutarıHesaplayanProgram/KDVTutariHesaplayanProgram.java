package KDVTutarıHesaplayanProgram;

import java.util.Scanner;

public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        float fiyat;

        Scanner input = new Scanner(System.in);
        System.out.print("Ürün fiyatini giriniz : ");
        fiyat = input.nextFloat();
        System.out.println("KDV'siz Fiyat : " + fiyat);

        if (fiyat <= 1000) {
            float tmp = fiyat;
            fiyat *= 1.18;
            System.out.println("KDV oranı : %18");
            System.out.println("KDV tutari: " + (fiyat - tmp));
            System.out.println("KDV'li Fiyat: " + fiyat);
        } else {
            float tmp = fiyat;
            fiyat *= 1.08;
            System.out.println("KDV oranı: %8");
            System.out.println("KDV tutari: " + (fiyat - tmp));
            System.out.println("KDV li Fiyat: " + fiyat);
        }

    }
}
