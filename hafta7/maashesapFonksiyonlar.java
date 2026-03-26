package hafta7;

import java.util.ArrayList;
import java.util.Scanner;

public class maashesapFonksiyonlar {
	public static Scanner giris = new Scanner(System.in);

	public static void main(String[] args) {

	}

	public static void VeriGiris(ArrayList<String> ad, ArrayList<String> medenidurum, ArrayList<Byte> cocuksayi,
			ArrayList<Double> brutmaas, ArrayList<Double> netmaas) {
		System.out.println("İsim giriniz: ");
		String isim = giris.next();
		ad.add(isim);
		System.out.println("Medeni durumunuzu belirtiniz: ");
		String medeni = giris.next();
		medenidurum.add(medeni);
		System.out.println("Çocuk sayısını giriniz: ");
		byte cocuk = giris.nextByte();
		cocuksayi.add(cocuk);
		System.out.println("Brüt maaşını giriniz: ");
		double bmaas = giris.nextDouble();
		double yenibmaas = 0;
		if (medeni.equalsIgnoreCase("evli")) {
			yenibmaas = (bmaas + 5000);
			brutmaas.add(yenibmaas);
			if (cocuk > 0) {
				yenibmaas = (cocuk * 2500)+ bmaas;
				brutmaas.add(yenibmaas);
			}
		}
		if (medeni.equalsIgnoreCase("bekar")) {
			yenibmaas += bmaas;
			if (cocuk > 0) {
				yenibmaas = (cocuk * 2500)+ bmaas;
				brutmaas.add(yenibmaas);
			}
		}
		
		
		netmaas.add((yenibmaas * 75) / 100);
	}

	public static void Listeleme(ArrayList<String> ad, ArrayList<String> medenidurum, ArrayList<Byte> cocuksayi,
			ArrayList<Double> brutmaas, ArrayList<Double> netmaas) {
		for (int i = 0; i < ad.size(); i++) {
			System.out.println("İsim : " + ad.get(i));
			System.out.println("Medeni durum : " + medenidurum.get(i));
			System.out.println("Çocuk sayısı : " + cocuksayi.get(i));
			System.out.println("Brüt maaş : " + brutmaas.get(i));
			System.out.println("Net maaş : " + netmaas.get(i));

		}
	}

	public static void İsimArama(ArrayList<String> ad, ArrayList<String> medenidurum, ArrayList<Byte> cocuksayi,
			ArrayList<Double> brutmaas, ArrayList<Double> netmaas) {
		// TODO Auto-generated method stub

	}

	public static void OrtalamaHesap(ArrayList<String> ad, ArrayList<String> medenidurum, ArrayList<Byte> cocuksayi,
			ArrayList<Double> brutmaas, ArrayList<Double> netmaas) {
		// TODO Auto-generated method stub

	}

	public static void EvliBilgi(ArrayList<String> ad, ArrayList<String> medenidurum, ArrayList<Byte> cocuksayi,
			ArrayList<Double> brutmaas, ArrayList<Double> netmaas) {
		// TODO Auto-generated method stub

	}

	public static void KayıtDuzeltme(ArrayList<String> ad, ArrayList<String> medenidurum, ArrayList<Byte> cocuksayi,
			ArrayList<Double> brutmaas, ArrayList<Double> netmaas) {
		// TODO Auto-generated method stub

	}

	public static void Silme(ArrayList<String> ad, ArrayList<String> medenidurum, ArrayList<Byte> cocuksayi,
			ArrayList<Double> brutmaas, ArrayList<Double> netmaas) {
		// TODO Auto-generated method stub

	}

}
