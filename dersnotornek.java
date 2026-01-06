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
----------------------------------------------------------------------------
    public class Main {
    public static void main(String[] args) {
        //Değişken Tanımlaması:
        int a= 15, b=30,c,d;
        c=topla(a,b);
        d=topla(a,b,c,c);
        System.out.println("1. Metot İşlem Sonucu: "+topla(a,b)+"\n2. Metot İşlem Sonucu: "+ topla(a,b,c)+"\n3. Metot İşlem Sonucu: "+topla(a,b,c,d));
    }
    // Metot Tanımlaması:
    public static int topla(int a,int b){
        return a+b;
    }
    public static int topla(int a,int b,int c){
        return a+b+c;
    }
    public static int topla(int a,int b,int c, int d){
        return a+b+c+d;
    }
}
