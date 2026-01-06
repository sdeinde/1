public class Main {
    public static void main(String[] args) {
        System.out.println("- Toplama Metodu Çağırıldı.\n- İşlem Sonucu: "+toplama());
    }
    // Metot Tanımlaması:
    public static int toplama(){
        // Değişken Tanımlaması:
        int x=23;
        int y=624;
        // Geriye Değer Döndürme:
        return x+y;
    }
}
----------------------------------------------------------
    public class Main {
    public static void main(String[] args) {
        adım(); // Metodumuzu çağırdık.
    }
    // Metot Tanımlaması:
    public static void adım(){
        System.out.println("Benim adım: Sude");
    }
}
------------------------------------------------------
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Değişken Tanımlaması:
        int a,b;
        System.out.print("---------\nİlk Değeri Girin: ");
        a=scanner.nextInt();
        System.out.print("İkinci Değeri Girin: ");
        b=scanner.nextInt();
        System.out.println("---------\n"+a+" + "+b+" = "+toplama(a,b));
    }
    // Metot Tanımlaması:
    public static int toplama(int x,int y){
        return x+y;
    }
}
---------------------------------------------------------------------
    public class Main {
    public static void main(String[] args) {
        merhaba("Emre");
    }
    // Metot Tanımlaması:
    public static void merhaba(String isim){
        System.out.println("Merhaba "+isim+"! Hoş geldin.");
    }
}
