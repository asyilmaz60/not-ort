import java.util.Scanner;

public class kdvHesaplayici {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); 

        System.out.println("fiyatı giriniz");
        int price = input.nextInt();

        double KDV = price > 1000 ? 0.08 : 0.18;

        double hesaplananKDV = (price*KDV)+ price;

        System.out.println("KDV'li fiyat "+hesaplananKDV);
        System.out.println("KDV'siz fiyat "+price);
        System.out.println("Uygulanan KDV oranı: %" + (KDV * 100));

    }
}