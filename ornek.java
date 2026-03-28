package hafta1;

import java.util.Scanner;

public class ornek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		byte cesit;
		System.out.println("Kaç çeşit ürün var?");
		cesit= scan.nextByte();
		byte[] urunfiyat = new byte[cesit];
		for (int i = 0; i < cesit; i++) {
			System.out.println((i + 1) + ". ürünün fiyatını girin: ");
			urunfiyat[i] = scan.nextByte();
		}
		byte[] adet = new byte[cesit];
		for (int i = 0; i < cesit; i++) {
			System.out.println((i + 1) + ". üründen kaç adet aldınız?: ");
			adet[i] = scan.nextByte();
		}
		float uruntoplam;
		float geneltoplam = 0;
		for (int i = 0; i < cesit; i++) {
			uruntoplam = urunfiyat[i] * adet[i];
			System.out.println((i + 1) + ". üründen " + adet[i] + " tane aldınız. " + urunfiyat[i] + " TL'den toplam "
					+ uruntoplam + " lira tuttu.");
			geneltoplam += uruntoplam;
		}
		System.out.println("Toplam alışveriş tutarı: " + geneltoplam);
		if (geneltoplam >= 200) {
			float indirim = (float) (geneltoplam * 0.1);
			System.out.println("Yapılan indirim: " + indirim);
			geneltoplam = (float) (geneltoplam * 0.9);
			System.out.println("Ödenecek tutar: " + geneltoplam);
		} else {
			System.out.println("Ödenecek tutar: " + geneltoplam);
		}
	}

	}
