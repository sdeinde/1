package hafta7;

import java.util.ArrayList;
import java.util.Scanner;

public class maashesapOrnek {
	public static Scanner giris = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> ad = new ArrayList<String>();
		
		ArrayList<String> medenidurum = new ArrayList<String>();
		ArrayList<Byte> cocuksayi = new ArrayList<Byte>();
		ArrayList<Double> netmaas = new ArrayList<Double>();
		ArrayList<Double> brutmaas = new ArrayList<Double>();
		byte menu;
		while (true) {
			System.out.println(
					"1-Veri giriş\n2-Listeleme\n3-İsim Arama\n4-Ortalama hesaplama\n5-Evli olanların bilgileri\n6-Kayıt düzeltme\n7-Silme\n8-Çıkış");
			menu = giris.nextByte();
			switch (menu) {
			case 1:
				maashesapFonksiyonlar.VeriGiris(ad, medenidurum, cocuksayi, brutmaas, netmaas);
				break;
			case 2:
				maashesapFonksiyonlar.Listeleme(ad, medenidurum, cocuksayi, brutmaas, netmaas);
				break;
			case 3:
				maashesapFonksiyonlar.İsimArama(ad, medenidurum, cocuksayi, brutmaas, netmaas);
				break;
			case 4:
				maashesapFonksiyonlar.OrtalamaHesap(ad, medenidurum, cocuksayi, brutmaas, netmaas);
				break;
			case 5:
				maashesapFonksiyonlar.EvliBilgi(ad, medenidurum, cocuksayi, brutmaas, netmaas);
				break;
			case 6:
				maashesapFonksiyonlar.KayıtDuzeltme(ad, medenidurum, cocuksayi, brutmaas, netmaas);
				break;
			case 7:
				maashesapFonksiyonlar.Silme(ad, medenidurum, cocuksayi, brutmaas, netmaas);
				break;
			case 8:
				System.out.println("Program bitti.");
				System.exit(0);
			default:
				System.out.println("Yanlış menü değeri girdiniz.");

			}

		}
	}
}
