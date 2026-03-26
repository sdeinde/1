package proje4_diziler;

import java.util.Scanner;

public class OgrenciDevamsizlikTakibi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sınıfta kaç öğrenci var?: ");
		byte os = scan.nextByte();
		System.out.println("---------------------------------------");
		byte[] devamsızlık = new byte[os];
		for (int i = 0; i < os; i++) {
			System.out.println(i + 1 + ". öğrenci kaç gün devamsızlık yaptı?: ");
			devamsızlık[i] = scan.nextByte();
		}
		System.out.println("---------------------------------------");
		byte kalansayisi = 0;
		for (int i = 0; i < os; i++) {
			System.out.println(i + 1 + ". öğrencinin devamsızlık yaptığı gün sayısı: " + devamsızlık[i]);
			if (devamsızlık[i] > 10) {
				System.out.println("Öğrenci kaldı.");
				kalansayisi++;
			} else if (devamsızlık[i] >= 6 && devamsızlık[i] <= 10) {
				System.out.println("Öğrenci devamsızlık sınırında.");
			} else {
				System.out.println("Öğrencinin devam durumu iyi.");
			}
			System.out.println("---------------------------------------");
		}
		System.out.println("Devamsızlıktan kalan öğrenci sayısı: "+kalansayisi);
		System.out.println("Devamsızlıktan geçen öğrenci sayısı: "+(os-kalansayisi));
	}
}
