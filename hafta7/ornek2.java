package hafta1;

import java.util.Scanner;

public class ornek2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç çeşit ürün var?: ");
		byte cesit = scan.nextByte();
		String[] birim = new String[cesit];
		String[] ad = new String[cesit];
		int[] fiyat = new int[cesit];
		int[] kod = new int[cesit];
		int[] miktar = new int[cesit];
		for (int i = 0; i < cesit; i++) {
			System.out.println(i + 1 + ". ürünün adını girin: ");
			ad[i] = scan.next();
			System.out.println(i + 1 + ". ürünün kodunu girin: ");
			kod[i] = scan.nextInt();
			System.out.println(i + 1 + ". ürünün birimini girin: ");
			birim[i] = scan.next();
			System.out.println(i + 1 + ". ürünün miktarını girin: ");
			miktar[i] = scan.nextInt();
			System.out.println(i + 1 + ". ürünün birim fiyatını girin: ");
			fiyat[i] = scan.nextInt();
		}
		
	}
}
