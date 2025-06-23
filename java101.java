import java.util.Scanner;

public class java101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;

        // Her ders için notları al ve 0-100 arası değilse programı sonlandır
        System.out.print("Matematik notunuzu girin: ");
        mat = scanner.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Geçersiz not! 0 ile 100 arasında olmalı.");
            return;
        }

        System.out.print("Fizik notunuzu girin: ");
        fizik = scanner.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Geçersiz not! 0 ile 100 arasında olmalı.");
            return;
        }

        System.out.print("Kimya notunuzu girin: ");
        kimya = scanner.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Geçersiz not! 0 ile 100 arasında olmalı.");
            return ;
        }

        System.out.print("Türkçe notunuzu girin: ");
        turkce = scanner.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Geçersiz not! 0 ile 100 arasında olmalı.");
            return;
        }

        System.out.print("Tarih notunuzu girin: ");
        tarih = scanner.nextInt();
        if (tarih < 0 || tarih > 100) {
            System.out.println("Geçersiz not! 0 ile 100 arasında olmalı.");
            return;
        }

        System.out.print("Müzik notunuzu girin: ");
        muzik = scanner.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Geçersiz not! 0 ile 100 arasında olmalı.");
            return;
        }

        float ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0f;
        String sonuc = ort > 59 ? "Geçti" : "Kaldı";

        System.out.println("Ortalamanız: " + ort + " - Sonuç: " + sonuc);

        scanner.close();
    }
    
}
