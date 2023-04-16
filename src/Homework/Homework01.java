package Homework;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        /*
        Sıcaklığı Fahrenhayt'tan Santigrat derecesine
        çeviren bir Java programı yazın.

        formül:
             c = (f-32)*5/9
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("fahrenayt degerini giriniz");
        double fh = scan.nextDouble();
        System.out.println("girdiginiz fahrenayt degeri : " + (fh - 32) * 5 / 9 + " santigrattır");

    }
}
