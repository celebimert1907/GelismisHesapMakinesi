package HesapMakinesi;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class HesapMakinesiGelismis {

    static int sum (int a, int b){
        int result = a + b;
        System.out.println(result);
        return result;
    }
    static int sub (int a, int b){
        int result = a - b;
        System.out.println(result);
        return result;
    }

    static  int multiPlication (int a , int b) {
        int result = a * b;
        System.out.println(result);
        return result;
    }
    static  int dividing (int a, int b){
        int result = a / b;
        System.out.println(result);
        return result;
    }

    static  int poweredNumbers (int a, int b){
        int result = a;
        for (int i = 1; i<b; i++){
            result = result * a;
        }
        System.out.println(result);
        return result;
    }

    static  int mode ( int a, int b ) {
        int result;
        result = a%b;
        System.out.println(result);
        return result;
    }

    static  int rectangleArea (int a, int b) {
        int area;
        area = a * b;
        System.out.println("Dikdortgenin alani: " + area);
        return area;
    }

    static int perimeter(int a, int b){
        int environtment;
        environtment = 2*(a+b);
        System.out.println("Dikdortgenin cevresi: " + environtment);
        return environtment;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choose;

        String menu ="===============\n"
        + "1- Toplama Islemi\n"
        + "2- Cikarma Islemi\n"
        + "3- Carpma Islemi\n"
        + "4- Bolme Islemi\n"
        + "5- Uslu Sayi Hesaplama\n"
        + "6- Mod Alma\n"
        + "7- Dikdortgen Alan ve Cevre Hesabi\n"
        + "0- Cikis ";

        while (true){
            System.out.println(menu);
            System.out.print("Yapilmak istenen islemi seciniz: ");
            choose = input.nextInt();

            if (choose == 0){
                break;
            } else if (choose == 5){
                System.out.println("Ilk ussu alinacak sayiyigiriniz.\n" + "Daha sonra ussu giriniz.");
            }


            System.out.println("1. sayiyi seciniz: ");
            int a= input.nextInt();
            System.out.println("2. sayiyi seciniz: ");
            int b=input.nextInt();

            switch (choose){
                case 1 :
                    sum(a,b);
                    break;
                case 2 :
                    sub(a,b);
                    break;
                case 3:
                    multiPlication(a,b);
                    break;
                case 4:
                    dividing(a,b);
                    break;
                case 5:
                    poweredNumbers(a,b);
                    break;
                case 6:
                    mode(a,b);
                    break;
                case 7:
                    rectangleArea(a,b);
                    perimeter(a,b);
                    break;
            }
        }
    }
}
