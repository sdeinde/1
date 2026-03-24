package hafta3;

import java.util.ArrayList;
import java.util.Scanner;

public class ogrenciListe {
	static Scanner giris = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<String> ad = new ArrayList<String>();
		ArrayList<Byte> vize = new ArrayList<Byte>();
		ArrayList<Byte> finalNot = new ArrayList<Byte>();
		ArrayList<Byte> basari = new ArrayList<Byte>();
		byte menu;
		while (true) {
			System.out.println(
					"1-KAyıt giriş\n2-Listeleme\n3-İsim Arama\n4-Düzeltme\n5-silme\n6-Ortalamalar\n7-En Büyük\n8-Çıkış");
			menu = giris.nextByte();
			switch (menu) {
			case 1:
				KayitGiris(ad, vize, finalNot, basari);
				break;
			case 2:
				Listeleme(ad, vize, finalNot, basari);
				break;
			case 3:
				isimArama(ad, vize, finalNot, basari);
				break;
			case 4:
				Duzeltme(ad, vize, finalNot, basari);
				break;
			case 5:
				Silme(ad, vize, finalNot, basari);
				break;
			case 6:
				byte vizeOrt = Ortalama(vize);
				System.out.println("Vize Not Ortalaması : " + vizeOrt);
				byte finalOrt = Ortalama(finalNot);
				System.out.println("Final Not Ortalaması : " + finalOrt);
				byte basariOrt = Ortalama(basari);
				System.out.println("Başarı Not Ortalaması : " + basariOrt);
			case 7:
				byte vizeEnb = EnBuyuk(vize);
				System.out.println("Vize Not En büyük : " + vizeEnb);
				byte finalEnb = EnBuyuk(finalNot);
				System.out.println("Final Not En Büyük : " + finalEnb);
				byte basariEnb = EnBuyuk(basari);
				System.out.println("Başarı Not En Büyük : " + basariEnb);
			case 8:
				System.out.println("Program bitti");
				System.exit(0);
			default:
				System.out.println("Yanlış menü değeri");
				break;
			}
		}
	}

	private static byte EnBuyuk(ArrayList<Byte> sinavNot) {
		byte enb = sinavNot.get(0);
		for (int i = 0; i < sinavNot.size(); i++) {
			if (sinavNot.get(i) > enb)
				enb = sinavNot.get(i);
		}
		return enb;
	}

	private static byte Ortalama(ArrayList<Byte> sinavNot) {
		int toplam = 0;
		for (int i = 0; i < sinavNot.size(); i++) {
			toplam += sinavNot.get(i);
		}
		return (byte) (toplam / sinavNot.size());
	}

	private static void Silme(ArrayList<String> ad, ArrayList<Byte> vize, ArrayList<Byte> finalNot,
			ArrayList<Byte> basari) {
		System.out.println("Silinecek ismi giriniz : ");
		String silinenAd = giris.next();
		int indis = ad.indexOf(silinenAd);
		ad.remove(indis);
		vize.remove(indis);
		finalNot.remove(indis);
		basari.remove(indis);
	}

	private static void Duzeltme(ArrayList<String> ad, ArrayList<Byte> vize, ArrayList<Byte> finalNot,
			ArrayList<Byte> basari) {
		System.out.println("Düzeltilecek ismi giriniz : ");
		String duzeltilen = giris.next();
		int indis = ad.indexOf(duzeltilen);
		System.out.println("Yeni İsim Giriniz : ");
		// ad.add(giris.next());
		String isim = giris.next();
		ad.set(indis, isim);
		System.out.println("Yeni Vize Notu Giriniz : ");
		byte vn = giris.nextByte();
		vize.set(indis, vn);
		System.out.println("Yeni Final notu giriniz");
		byte fn = giris.nextByte();
		finalNot.set(indis, fn);
		basari.set(indis, (byte) (vn * .4 + fn * .6));
	}

	private static void isimArama(ArrayList<String> ad, ArrayList<Byte> vize, ArrayList<Byte> finalNot,
			ArrayList<Byte> basari) {
		System.out.println("Aranacak ismi giriniz : ");
		String arananAd = giris.next();
		for (int i = 0; i < ad.size(); i++) {
			if (arananAd.equalsIgnoreCase(ad.get(i))) {
				System.out.println("İsim : " + ad.get(i));
				System.out.println("Vize not : " + vize.get(i));
				System.out.println("Final not : " + finalNot.get(i));
				System.out.println("Başarı not : " + basari.get(i));
			}
		}

	}

	private static void Listeleme(ArrayList<String> ad, ArrayList<Byte> vize, ArrayList<Byte> finalNot,
			ArrayList<Byte> basari) {
		for (int i = 0; i < ad.size(); i++) {
			System.out.println("İsim : " + ad.get(i));
			System.out.println("Vize not : " + vize.get(i));
			System.out.println("Final not : " + finalNot.get(i));
			System.out.println("Başarı not : " + basari.get(i));
		}

	}

	private static void KayitGiris(ArrayList<String> ad, ArrayList<Byte> vize, ArrayList<Byte> finalNot,
			ArrayList<Byte> basari) {
		System.out.println("İsim Giriniz : ");
		// ad.add(giris.next());
		String isim = giris.next();
		ad.add(isim);
		System.out.println("Vize Notu Giriniz : ");
		byte vn = giris.nextByte();
		vize.add(vn);
		System.out.println("Final notu giriniz");
		byte fn = giris.nextByte();
		finalNot.add(fn);
		basari.add((byte) (vn * .4 + fn * .6));
	}
}