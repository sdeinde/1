import java.util.Scanner;

public class Ornek {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsim giriniz : ");
       String ad=scanner.nextLine();
        scanner.close();
        System.out.println("Girilen ad : "+ad);
        String soyad=scanner.nextLine();
        scanner.close();
        System.out.println("Girilen soyad : "+soyad);
	}

}
