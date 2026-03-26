import java.util.ArrayList;
import java.util.Iterator;

public class Dongu1 {

    public static void main(String[] args) {
        // Standart String dizisi tanımı
        String adlar[] = { "Ali", "Veli", "Ayşe" };

        // For-each döngüsü ile dizi yazdırma
        for (String ad : adlar) {
            System.out.println(ad);
        }
        System.out.println("-------------------------");

        // ArrayList tanımı ve eleman ekleme
        ArrayList<String> isimler = new ArrayList<String>();
        isimler.add("Zeynep");
        isimler.add("Aykut");
        isimler.add("Berkay");
        isimler.add("Uygar");

        // For-each döngüsü ile ArrayList yazdırma
        for (String isim : isimler) {
            System.out.println(isim);
        }
        System.out.println("-------------------------");

        // Iterator kullanarak ArrayList üzerinde dönme
        for (Iterator iterator = isimler.iterator(); iterator.hasNext();) {
            String isim = (String) iterator.next();
            System.out.println(isim);
        }
        System.out.println("-------------------------");

        // Geleneksel for döngüsü ve index ile dizi yazdırma
        for (int i = 0; i < adlar.length; i++) {
            System.out.println(adlar[i]);
        }
        System.out.println("-------------------------");

        // Belirli bir indeksteki elemana erişim
        System.out.println(adlar[0]); // Dizinin ilk elemanı
        String isim = isimler.get(0); // ArrayList'in ilk elemanı
        System.out.println(isim);
        System.out.println("-------------------------");

        // Lambda ifadesi (forEach) ile yazdırma
        isimler.forEach(veri -> System.out.println(veri));
        System.out.println("-------------------------");

        // Method Reference kullanarak yazdırma
        isimler.forEach(System.out::println);
    }
}
