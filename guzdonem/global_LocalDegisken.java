package hafta13;

public class global_LocalDegisken {
	public static int veri = 10;
	public static final int veriSabit = 10;

	public static void main(String[] args) {
		int sayi = 5;
		islem();
		System.out.println("sayı: "+sayi);
		System.out.println("global veri: "+veri);
		int veri=25;
		System.out.println("lokal veri: "+veri);
	}

	private static void islem() {
		int sayi = 3;
		veri = 30;
		//veriSabit=40;
		System.out.println("sayı: "+sayi);
		System.out.println("veri: "+veri);
	}

}
