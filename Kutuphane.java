package hafta11;

import java.util.Iterator;
import java.util.Scanner;

public class Kutuphane {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç kitap gireceksiniz?: ");
		byte kitapsayi = scan.nextByte();
		String[] kitapAd = new String[kitapsayi];
		String[] yazarAd = new String[kitapsayi];
		String[] yayınAd = new String[kitapsayi];
		short[] sayfasayisi = new short[kitapsayi];
		short[] fiyat = new short[kitapsayi];
		for (int i = 0; i < fiyat.length; i++) {
			System.out.println(i + 1 + ". kitabın adını giriniz: ");
			kitapAd[i] = scan.next();
			System.out.println(i + 1 + ". kitabın yazarını giriniz: ");
			yazarAd[i] = scan.next();
			System.out.println(i + 1 + ". kitabın yayınevini giriniz: ");
			yayınAd[i] = scan.next();
			System.out.println(i + 1 + ". kitabın sayfa sayısını giriniz: ");
			sayfasayisi[i] = scan.nextShort();
			System.out.println(i + 1 + ". kitabın fiyatını giriniz: ");
			fiyat[i] = scan.nextShort();
			System.out.println("--------------------------------");
		}
		while (true) {
			byte menu = MenuGoruntule(scan);
			switch (menu) {
			case 1:
				Listele(kitapAd, yazarAd, yayınAd, sayfasayisi, fiyat);
				break;
			case 7:
				System.out.println("Program sonlanmıştır.");
				System.exit(0);
			default:
				System.out.println("Yanlış karakter tuşladınız!!");
				break;
			case 4:
				System.out.println("En fazla sayfa sayısı:" + Enbuyuk(sayfasayisi));
				System.out.println("En fazla fiyat:" + Enbuyuk(fiyat));
				break;
			case 5:
				System.out.println("En az sayfa sayısı:" + Enkucuk(sayfasayisi));
				System.out.println("En az fiyat:" + Enkucuk(fiyat));
			case 6:
				EnBuyukFiyat(kitapAd, yazarAd, yayınAd, sayfasayisi, fiyat);
				break;
			case 2:İsimarama();
			}

		}

	}

	private static void İsimarama() {
		// TODO Auto-generated method stub
		
	}

	private static void EnBuyukFiyat(String[] kitapAd, String[] yazarAd, String[] yayınAd, short[] sayfasayisi,
			short[] fiyat) {
		short enBuyukFiyat = Enbuyuk(fiyat);
		for (int i = 0; i < fiyat.length; i++) {
			if (fiyat[i] == enBuyukFiyat) {
				System.out.println("Kitap adı: " + kitapAd[i]);
				System.out.println("Yazar adı: " + yazarAd[i]);
				System.out.println("Yayınevi adı: " + yayınAd[i]);
				System.out.println("Kitap sayfa sayısı: " + sayfasayisi[i]);
				System.out.println("Kitap fiyatı: " + fiyat[i]);

			}

		}
	}

	private static short Enkucuk(short[] sayilar) {
		short enk = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			if (sayilar[i] < enk) {
				enk = sayilar[i];
			}
		}
		return enk;
	}

	private static short Enbuyuk(short[] sayilar) {
		short enb = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			if (sayilar[i] > enb) {
				enb = sayilar[i];
			}
		}
		return enb;
	}

	private static void Listele(String[] kitapAd, String[] yazarAd, String[] yayınAd, short[] sayfasayisi,
			short[] fiyat) {
		for (int i = 0; i < fiyat.length; i++) {
			System.out.println("Kitap adı: " + kitapAd[i]);
			System.out.println("Yazar adı: " + yazarAd[i]);
			System.out.println("Yayınevi adı: " + yayınAd[i]);
			System.out.println("Kitap sayfa sayısı: " + sayfasayisi[i]);
			System.out.println("Kitap fiyatı: " + fiyat[i]);
			System.out.println("--------------------------------");

		}
	}

	private static byte MenuGoruntule(Scanner scan) {
		System.out.println("Seçim yapınız: ");
		System.out.println("\n1-Listeleme \n2-İsim arama \n3-Ortalama \n4-En Büyük \n5-En küçük \n6-Çıkış");
		byte menu = scan.nextByte();
		return menu;
	}

}
