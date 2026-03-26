package hafta13;

public class Fonksiyonislem {

	public static void main(String[] args) {
		int s1 = 3, s2 = 5, s3 = 15, s4 = 20;
		int toplam = Toplama(s1, s2);
		System.out.println(s1 + "+" + s2 + "=" + toplam);
		toplam = Toplama(s1, s2, s3);
		System.out.println(s1 + "+" + s2 + "+" + s3 + "=" + toplam);
		toplam = Toplama(s1, s2, s3, s4);
		System.out.println(s1 + "+" + s2 + "+" + s3 + "+" + s4 + "=" + toplam);
		float f1 = 3.45f, f2 = 34.6f;
		float ftoplam = Toplama(f1, f2);
		System.out.println(f1 + "+" + f2 + "=" + ftoplam);
		float toplam1 = Toplama(s1, f1);
		System.out.println(s1 + "+" + f1 + "=" + toplam1);
		ortalama(s1, s2, s3);
		ortalama(s1, s2, s3, s4);

	}

	private static void ortalama(int... sayilar) {
		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		System.out.println("Ortalama: " + toplam/sayilar.length);
	}

	private static float Toplama(float f1, float f2) {
		System.out.println("2 farklı değişken");
		return f1 + f2;
	}

	private static int Toplama(int s1, int s2, int s3, int s4) {
		System.out.println("4 değişken");
		return s1 + s2 + s3 + s4;
	}

	private static int Toplama(int s1, int s2, int s3) {
		System.out.println("3 değişken");
		return s1 + s2 + s3;
	}

	private static int Toplama(int s1, int s2) {
		System.out.println("2 int değişken");
		return s1 + s2;
	}

}
