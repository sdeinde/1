package proje4_diziler;

import java.util.Scanner;

public class ATMMenu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç kişi ATM kullanacak?: ");
		byte ks = scan.nextByte();
		System.out.println("------------------------");
		int[] bakiye = new int[ks];
		for (int i = 0; i < ks; i++) {
			System.out.println(i + 1 + ". kişinin bakiyesini giriniz: ");
			bakiye[i] = scan.nextInt();
		}
		System.out.println("------------------------");
		byte menu;
		byte islemsonrasisecim = 1;
		do {
			System.out.println("Yapmak istediğiniz işlemi tuşlayınız: ");
			System.out.println("\n1-Bakiye Görüntüle \n2-Para Yatır \n3-Para Çek");
			menu = scan.nextByte();
			System.out.println("------------------------");
			switch (menu) {
			case 1:
				for (int i = 0; i < ks; i++) {
					System.out.println(i + 1 + ". kişinin bakiyesi: " + bakiye[i]);
				}
				break;
			case 2:
				int[] yatırılacakpara = new int[ks];
				for (int i = 0; i < ks; i++) {
					System.out.println(i + 1 + ". Kişi yatırmak istediğiniz para miktarını giriniz: ");
					yatırılacakpara[i] = scan.nextInt();
					bakiye[i] = bakiye[i] + yatırılacakpara[i];
					System.out.println(i + 1 + ". Kişi güncel bakiyeniz: " + bakiye[i]);
					System.out.print("\n");
					System.out.println("...........");
				}
				break;
			case 3:
				int[] cekilecekpara = new int[ks];
				for (int i = 0; i < ks; i++) {
					System.out.println(i + 1 + ". Kişi çekmek istediğiniz para miktarını giriniz: ");
					cekilecekpara[i] = scan.nextInt();
					bakiye[i] = bakiye[i] - cekilecekpara[i];
					System.out.println(i + 1 + ". Kişi güncel bakiyeniz: " + bakiye[i]);
					System.out.print("\n");
					System.out.println("...........");
				}
				break;
			default:
				System.out.println("Yanlış tuşlama yaptınız!!");
				break;
			}
			System.out.println("\n----- İşlem Sonu -----");
			System.out.print("Yapmak istediğiniz işlemi tuşlayınız: ");
			System.out.println("\n1-Menüye Dön \n2-ATM'den Çıkış ");
			islemsonrasisecim = scan.nextByte();
			System.out.println("------------------------");
			if (islemsonrasisecim == 2) {
				System.out.println("İşleminiz sonlandırılmıştır.");
			} else if (islemsonrasisecim != 2 && islemsonrasisecim != 1) {
				System.out.println("Yanlış tuşlama yaptınız!!");
			}
		} while (islemsonrasisecim == 1);

	}

}
