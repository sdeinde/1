package hafta9;

import java.util.ArrayList;
import java.util.Scanner;

public class KafeFonksiyonlar {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void KayıtGiris(ArrayList<String> isim, ArrayList<Byte> miktar, ArrayList<Double> fiyat,
			ArrayList<String> cesit) {
		System.out.println("Ürün adı: ");
		String ad = scan.next();
		isim.add(ad);
		System.out.println("Ürün çeşidi (Sıcak/Soğuk): ");
		String ucesit = scan.next();
		cesit.add(ucesit);
		System.out.println("Ürün miktarı: ");
		byte adet = scan.nextByte();
		miktar.add(adet);
		System.out.println("Ürün fiyatı: ");
		double fyt = scan.nextDouble();
		fiyat.add(fyt);
	}

	public static void Listeleme(ArrayList<String> isim, ArrayList<Byte> miktar, ArrayList<Double> fiyat,
			ArrayList<String> cesit) {
		for (int i = 0; i < isim.size(); i++) {
			System.out.println("Ürün adı : " + isim.get(i));
			System.out.println("Ürün çeşidi : " + cesit.get(i));
			System.out.println("ürün miktarı : " + miktar.get(i));
			System.out.println("Ürün fiyat : " + fiyat.get(i));
		}
	}

	public static void Duzeltme(ArrayList<String> isim, ArrayList<Byte> miktar, ArrayList<Double> fiyat,
			ArrayList<String> cesit) {
		for (int i = 0; i < isim.size(); i++) {
			System.out.println("Düzeltmek istediğiniz ürünün adı: ");
			String yeniisim = scan.next();
			isim.set(i, yeniisim);
			System.out.println("Düzeltmek istediğiniz ürünün çeşidi: ");
			String yenicesit = scan.next();
			cesit.set(i, yenicesit);
			System.out.println("Düzeltmek istediğiniz ürünün miktarı: ");
			byte yenimiktar = scan.nextByte();
			miktar.set(i, yenimiktar);
			System.out.println("Düzeltmek istediğiniz ürünün fiyatı: ");
			double yenifiyat = scan.nextByte();
			fiyat.set(i, yenifiyat);
		}

	}

	public static void Silme(ArrayList<String> isim, ArrayList<Byte> miktar, ArrayList<Double> fiyat,
			ArrayList<String> cesit) {
		for (int i = 0; i < isim.size(); i++) {
			System.out.println("Silmek istediğiniz ürünün adı: ");
			isim.remove(i);
			System.out.println("Silmek istediğiniz ürünün çeşidi: ");
			cesit.remove(i);
			System.out.println("Silmek istediğiniz ürünün miktarı: ");
			miktar.remove(i);
			System.out.println("Silmek istediğiniz ürünün fiyatı: ");
			fiyat.remove(i);
		}
	}

	public static void UrunSatis(ArrayList<String> isim, ArrayList<Byte> miktar, ArrayList<Double> fiyat,
			ArrayList<String> cesit) {
		System.out.println("Satılan ürünün ismini giriniz : ");
		String satılanUrun = scan.next();
		for (int i = 0; i < isim.size(); i++) {
			if (satılanUrun.equalsIgnoreCase(isim.get(i))) {
				System.out.println("Eski stok: " + miktar.get(i));
				System.out.println("Güncellenen stok: " + miktar.remove(miktar.size() - 2));

			}
		}

	}

	public static void UrunAlis(ArrayList<String> isim, ArrayList<Byte> miktar, ArrayList<Double> fiyat,
			ArrayList<String> cesit) {
		System.out.println("Alınan ürünün ismini giriniz : ");
		String alınanUrun = scan.next();
		for (int i = 0; i < isim.size(); i++) {
			if (alınanUrun.equalsIgnoreCase(isim.get(i))) {
				System.out.println("Eski stok: " + miktar.get(i));
				System.out.println("Güncellenen stok: " + miktar.remove(miktar.size()-1));
			}
		}
	}

	public static double ToplamUrun(ArrayList<String> isim, ArrayList<Byte> miktar, ArrayList<Double> fiyat,
			ArrayList<String> cesit) {
		double toplam=0;
			for (int i = 0; i < fiyat.size(); i++) {
				toplam += fiyat.get(i);
			}
			System.out.println("Ürünlerin toplam fiyatı: "+toplam);
			return toplam;
		}

	

	public static void SayisalVeriler(ArrayList<String> isim, ArrayList<Byte> miktar, ArrayList<Double> fiyat,
			ArrayList<String> cesit) {
		double toplam=0;
		for (int i = 0; i < fiyat.size(); i++) {
			toplam += fiyat.get(i);
		}
		System.out.println("Ürünlerin fiyat ortalaması: "+toplam/(fiyat.size()));
		Double enb = fiyat.get(0);
		for (int i = 0; i < fiyat.size(); i++) {
			if (fiyat.get(i) > enb)
				enb = fiyat.get(i);
		}
		System.out.println("En pahalı ürün fiyatı: "+enb);
		Double enk = fiyat.get(0);
		for (int i = 0; i < fiyat.size(); i++) {
			if (fiyat.get(i) < enk)
				enk = fiyat.get(i);
		}
		System.out.println("En ucuz ürün fiyatı: "+enk);
	}

}
