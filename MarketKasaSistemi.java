package proje4_diziler;

import java.util.Scanner;

public class MarketKasaSistemi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bu markette 5 çeşit ürün satılmaktadır.");
		System.out.println("---------------------------------------");
		byte cesit = 5;
		float[] urunfiyat = new float[cesit];
		for (int i = 0; i < cesit; i++) {
			System.out.println((i + 1) + ". ürünün fiyatını girin: ");
			urunfiyat[i] = scan.nextFloat();
		}
		System.out.println("---------------------------------------");
		byte[] adet = new byte[cesit];
		for (int i = 0; i < cesit; i++) {
			System.out.println((i + 1) + ". üründen kaç adet aldınız?: ");
			adet[i] = scan.nextByte();
		}
		System.out.println("---------------------------------------");
		float uruntoplam;
		float geneltoplam = 0;
		for (int i = 0; i < cesit; i++) {
			uruntoplam = urunfiyat[i] * adet[i];
			System.out.println((i + 1) + ". üründen " + adet[i] + " tane aldınız. " + urunfiyat[i] + " TL'den toplam "
					+ uruntoplam + " lira tuttu.");
			geneltoplam += uruntoplam;
		}
		System.out.println("---------------------------------------");
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
//Toplamda cesit,urunfiyat,adet,uruntoplam,geneltoplam,indirim olmak üzere 6 değişken kullandım.
