package hafta5;

public class MatematikSinifi {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.pow(2, 10));
		System.out.println("Math.round(2.45): " + Math.round(2.45));
		System.out.println(benimpow(2, 10));
		System.out.println("(int)2.65: " + (int) (2.65 + 0.5));
		System.out.println(Math.sqrt(345));
		System.out.println(Math.floor(3.45));
		System.out.println(Math.ceil(3.45));
		System.out.println("Taban değer: " + (int) 3.45);
		System.out.println("Tavan değer: " + ((int) (3.45) + 1));
		System.out.println(benimmax(3, 8));
		System.out.println(benimmin(3, 8));

	}

	private static int benimmin(int i, int j) {
		int min = 0;
		if (i < j) {
			min = i;
		} else
			min = j;
		return min;
	}

	private static int benimmax(int d, int i) {
		int max = 0;
		if (d > i) {
			max = d;
		} else
			max = i;
		return max;
	}

	private static int benimpow(int i, int j) {
		int carpim = 1;
		for (int k = 1; k <= j; k++) {
			carpim *= i;
		}
		return carpim;
	}

}
