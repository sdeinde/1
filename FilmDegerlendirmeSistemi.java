package proje5_Listeler;

import java.util.ArrayList;
import java.util.Scanner;

public class FilmDegerlendirmeSistemi {
	static Scanner giris = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<String> filmler = new ArrayList<String>();
		ArrayList<String> turler = new ArrayList<String>();
		ArrayList<Byte> puan = new ArrayList<Byte>();
		ArrayList<String> izlenecekfilm = new ArrayList<String>();
		ArrayList<String> izlenecektur = new ArrayList<String>();
		byte menu;
		while (true) {
			System.out.println(
					"1-Film puanla\n2-İzlenecek film ekle\n3-Filmleri listele\n4-Ortalamanın üstündeki filmleri listele\n5-En yüksek puanlı filmi bul\n6-Film arama\n7-Çıkış yap\n...........\nSeçiminiz: ");
			menu = giris.nextByte();
			switch (menu) {
			case 1:
				FilmPuanla(filmler, turler, puan);
				break;
			case 2:
				Watchlist(izlenecekfilm, izlenecektur);
				break;
			case 3:
				Listeleme(filmler, turler, puan, izlenecekfilm, izlenecektur);
				break;
			case 4:
				int index = 0;
				for (int i = 0; i < puan.size(); i++) {
					if (OrtListele(filmler, turler, puan) < puan.get(i)) {
						index = i;
						System.out.println("Puanı ortalamadan büyük filmler: " + filmler.get(index));
						System.out.println("Puan: " + puan.get(index));
					}
				}
				break;
			case 5:
				EnBuyuk(filmler, turler, puan);

				break;
			case 6:
				FilmArama(filmler, turler, puan, izlenecekfilm, izlenecektur);
				break;
			case 7:
				System.out.println("Program bitti");
				System.exit(0);
				break;
			default:
				System.out.println("Yanlış menü değeri");
				break;
			}

		}

	}

	private static void FilmArama(ArrayList<String> filmler, ArrayList<String> turler, ArrayList<Byte> puan,
			ArrayList<String> izlenecekfilm, ArrayList<String> izlenecektur) {
		System.out.println("Aramak istediğiniz filmi giriniz: ");
		String arananFilm = giris.next();
		boolean bulundu = false;
		for (int i = 0; i < filmler.size(); i++) {
			if (arananFilm.equalsIgnoreCase(filmler.get(i))) {
				System.out.println("Film adı: " + filmler.get(i));
				System.out.println("Film türü: " + turler.get(i));
				System.out.println("Film puanı: " + puan.get(i));
				bulundu = true;
	            break;
			}
		}
	if (!bulundu) {
        for (int i = 0; i < izlenecekfilm.size(); i++) {
            if (arananFilm.equalsIgnoreCase(izlenecekfilm.get(i))) {
                System.out.println("Film adı: " + izlenecekfilm.get(i));
                System.out.println("Film türü: " + izlenecektur.get(i));
                bulundu = true;
                break;
            }
        }
	}
	if (!bulundu) {
	     System.out.println("Aradığınız film bulunamadı.");
    }
}

	private static void EnBuyuk(ArrayList<String> filmler, ArrayList<String> turler, ArrayList<Byte> puan) {
		byte enb = puan.get(0);
		int index = 0;
		for (int i = 0; i < puan.size(); i++) {
			if (enb < puan.get(i)) {
				enb = puan.get(i);
				index = i;
			}
		}
		System.out.println("En yüksek puanlı film: " + filmler.get(index));
		System.out.println("Puan: " + puan.get(index));
	}

	private static int OrtListele(ArrayList<String> filmler, ArrayList<String> turler, ArrayList<Byte> puan) {
		int toplam = 0;
		for (int i = 0; i < puan.size(); i++) {
			toplam += puan.get(i);
		}
		return (toplam / puan.size());
	}

	private static void Listeleme(ArrayList<String> filmler, ArrayList<String> turler, ArrayList<Byte> puan,
			ArrayList<String> izlenecekfilm, ArrayList<String> izlenecektur) {
		System.out.println(".....İZLENEN FİLMLER.....");
		for (int i = 0; i < filmler.size(); i++) {
			System.out.println("Film adı: " + filmler.get(i));
			System.out.println("Film türü: " + turler.get(i));
			System.out.println("Film puanı: " + puan.get(i));
			System.out.println("-----------------------------");
		}
		System.out.println(".....İZLENECEK FİLMLER.....");
		for (int i = 0; i < izlenecekfilm.size(); i++) {
			System.out.println("Film adı: " + izlenecekfilm.get(i));
			System.out.println("Film türü: " + izlenecektur.get(i));
			System.out.println("-----------------------------");
		}
	}

	private static void Watchlist(ArrayList<String> izlenecekfilm, ArrayList<String> izlenecektur) {
		System.out.println("İzlemek istediğiniz filmi giriniz: ");
		String ad = giris.next();
		izlenecekfilm.add(ad);
		System.out.println("İzlemek istediğiniz filmin türünü giriniz: ");
		String tur = giris.next();
		izlenecektur.add(tur);

	}

	private static void FilmPuanla(ArrayList<String> filmler, ArrayList<String> turler, ArrayList<Byte> puan) {
		System.out.println("İzlediğiniz filmin adı giriniz: ");
		String isim = giris.next();
		filmler.add(isim);
		System.out.println("İzlediğiniz filmin türünü giriniz: ");
		String ftur = giris.next();
		turler.add(ftur);
		System.out.println("İzlediğiniz filme vermek istediğiniz puanı giriniz: ");
		byte fpuan = giris.nextByte();
		puan.add(fpuan);
	}

}
