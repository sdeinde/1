package örnek1;

import java.util.Scanner;

public class örnek2 {

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.println("İsim Giriniz:");
		String ad=klavye.next();
		System.out.println("Vize Notu Giriniz :");
		byte  vizeNot=klavye.nextByte();
		System.out.println("Final Notu Giriniz :");
		byte  finalNot=klavye.nextByte();
		System.out.println("Adı :"+ad);
		System.out.println("Vize notu :"+vizeNot);
		System.out.println("Final notu :"+finalNot);
		byte basariNotByte=(byte) (vizeNot*0.4+finalNot*0.6);
		System.out.println("Başarı Notu :"+basariNotByte);

	}

}
