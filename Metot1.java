
public class Metot1 {
	public static void main(String[] args) {
		selamlama();// fonksiyon çağarma
		selamlama();
		selamlama();
		toplama(3, 6);
		int s1 = 5, s2 = 10;
		toplama(s1, s2);
		int sonuc = topla(s1, s2);
		System.out.println(s1 + " + " + s2 + " = " + sonuc);
		int sayilar[]= {3,7,2,9,11};
		enBuyuk(sayilar);
	}

private static void enBuyuk(int[] sayilar) {
		int enb=sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			if(sayilar[i]>enb) enb=sayilar[i];
		}
		System.out.println("Girilen sayıların en büyüğü = "+enb);
	}

private static int topla(int s1, int s2) {
	System.out.println("parametreli ve geri dönüşlü fonksiyon");
		int son=s1+s2;
		return son;
	}

//2 tane tamsayı tipinde parametreli fonksiyon
	private static void toplama(int sayi1, int sayi2) {
		System.out.println("Parametreli fonksiyon");
		System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
	}

//parametresiz fonksiyon
	public static void selamlama() {
		System.out.println("Parametresiz fonksiyon");
		System.out.println("Merhaba");
	}
}
