package hafta9;

import java.util.ArrayList;
import java.util.Scanner;

public class KafeOrnek {
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<String> isim=new ArrayList();
		ArrayList<Byte> miktar=new ArrayList();
		ArrayList<Double> fiyat=new ArrayList();
		ArrayList<String> cesit=new ArrayList();
		byte menu;
		while (true) {
			System.out.println(
					"1-Kayıt giriş\n2-Çeşide göre Listeleme\n3-Düzeltme\n4-Silme\n5-Ürün satış\n6-ürün alış\n7-Kafedeki toplam ürün bedeli\n8-Sayısal veriler\n9-Çıkış");	
			menu = scan.nextByte();
			switch (menu) {
			case 1: KafeFonksiyonlar.KayıtGiris(isim,miktar,fiyat,cesit);
				break;
			case 2: KafeFonksiyonlar.Listeleme(isim,miktar,fiyat,cesit); break;
			case 3: KafeFonksiyonlar.Duzeltme(isim,miktar,fiyat,cesit); break;
			case 4:KafeFonksiyonlar.Silme(isim,miktar,fiyat,cesit); break;
			case 5: KafeFonksiyonlar.UrunSatis(isim,miktar,fiyat,cesit); break;
			case 6:KafeFonksiyonlar.UrunAlis(isim,miktar,fiyat,cesit); break;
			case 7:KafeFonksiyonlar.ToplamUrun(isim,miktar,fiyat,cesit); break;
			case 8: KafeFonksiyonlar.SayisalVeriler(isim,miktar,fiyat,cesit); break;
			case 9: System.out.println("Program sonlandırıldı."); System.exit(0);
			default: System.out.println("Yanlış değer girdiniz!!");
				break;
			}
			
		}
		
	}

}
