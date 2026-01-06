import java.util.Iterator;
import java.util.Scanner;

public class Fonksiyonlar {

	public static void VeriAlma(Scanner giris, String[] ad, byte[] vn, byte[] fn, byte[] bn) {
		for (int i = 0; i < bn.length; i++) {
			System.out.println("isim giriniz");
			ad[i]=giris.next();
			System.out.println("Vize notu giriniz");
			vn[i]=giris.nextByte();
			System.out.println("Final notu giriniz");
			fn[i]=giris.nextByte();
			bn[i]=(byte) ((vn[i]+fn[i])/2);
		}
	}

	public static byte MenuAl(Scanner giris) {
		System.out.println("0-Çıkış\n1-Listeleme\n2-Ad arama\n3-Ortalamalar");
		return giris.nextByte();
	}

	public static void Listeleme(String[] ad, byte[] vn, byte[] fn, byte[] bn) {
		for (int i = 0; i < bn.length; i++) {
			System.out.println("İsminiz : "+ad[i]);
			System.out.println("Vize Notunuz : "+vn[i]);
			System.out.println("Final Notunuz : "+fn[i]);
			System.out.println("Başarı Notunuz : "+bn[i]);
		}
		
	}

	public static void AdArama(String arananAd, String[] ad, byte[] vn, byte[] fn, byte[] bn) {
		for (int i = 0; i < bn.length; i++) {
			if(arananAd.equalsIgnoreCase(ad[i])) {
				System.out.println("İsminiz : "+ad[i]);
				System.out.println("Vize Notunuz : "+vn[i]);
				System.out.println("Final Notunuz : "+fn[i]);
				System.out.println("Başarı Notunuz : "+bn[i]);
			}
		}
		
	}

	public static void Ortalama(byte[] vn, byte[] fn, byte[] bn) {
		System.out.println("Vize Not Ortalaması : "+OrtalamaHesap(vn));
		System.out.println("Final Not Ortalaması : "+OrtalamaHesap(fn));
		System.out.println("Başarı Not Ortalaması : "+OrtalamaHesap(bn));
	}

	private static byte OrtalamaHesap(byte[] sayi) {
		int toplam=0;
		for (int i = 0; i < sayi.length; i++) {
			toplam+=sayi[i];
		}
		return (byte) (toplam/sayi.length);
	}

}
