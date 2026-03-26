import java.util.Scanner;

public class vkihesap {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
         System.out.println("Kilo:");
        double kilo = klavye.nextDouble(); 
        System.out.println("Boy:");
        double boy = klavye.nextDouble();
        double vki = kilo / (boy * boy);
        System.out.println("Hesaplanan Vücut Kitle İndeksiniz (VKİ): " + vki);
        System.out.print("Durumunuz: ");
        
        if (vki < 18.5) 
            System.out.println("Zayıf");
         else if (vki >= 18.5 && vki <= 24.9) 
            System.out.println("Normal Kilolu");
         else if (vki >= 25.0 && vki <= 29.9) 
            System.out.println("Fazla Kilolu");
         else if (vki >= 30.0 && vki <= 39.9) 
            System.out.println("Obez");
            else System.out.println("İleri düzeyde obez");
    }
}