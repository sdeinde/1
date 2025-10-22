package aritmetik;

import java.util.Scanner;

public class kosulluvize {
	public static void main (String[]args) {
Scanner giris=new Scanner(System.in);
System.out.println("İsim Giriniz:");
String ad=giris.next();
System.out.println("Vize notu Giriniz:");
byte vn=giris.nextByte();
System.out.println("Final notu Giriniz:");
byte fn=giris.nextByte();
byte bn=(byte)((vn+fn)/2);
System.out.println("Başarı Notunuz:"+bn);
/*
 * if (bn>=50) System.out.println("Geçtiniz!"); else
 * System.out.println("Kaldınız.");
 */
if (bn>=0 && bn<=30)
System.out.println("Harf Notunuz: FF");
else if (bn>=31 && bn<=40);
System.out.println("Harf Notunuz: DD");
else if (bn>=41 && bn<=50);
System.out.println("Harf Notunuz: DC");
else if (bn>=51 && bn<=60);
System.out.println("Harf Notunuz: CC");
else if (bn>=61 && bn<=70);
System.out.println("Harf Notunuz: CB");
else if (bn>=71 && bn<=80);
System.out.println("Harf Notunuz: BB");
else if (bn>=81 && bn<=90);
System.out.println("Harf Notunuz: BA");
else  (bn>=91 && bn<=100);
System.out.println("Harf Notunuz: AA");

}


}
