package hafta4;

import java.util.Scanner;

public class örnek3 {

	public static void main(String[] args) {
Scanner klavye=new Scanner(System.in);
//int dk,sms,inte;
//System.out.println("Kullandığınız dakika:"+dk);
//dk=klavye.nextInt();
//System.out.println("Kullandığınız sms:"+sms);
//sms=klavye.nextInt();
//System.out.println("Kullandığınız internet:"+inte);
//inte=klavye.nextInt();
//double brut=(dk*0.8+sms*0.5+inte*15);
//double fatura=(brut+brut%25+brut%04+brut%15);
//System.out.println("Faturanız:"+fatura);
//int dk,sms,inte;
//double fatura,odenecektutar;
//double vergi;
	//System.out.println("Kaç dakika:");
	/*
	 * int maas,kira,fatura,mutfak,harcama,kalan; System.out.println("Maaş:");
	 * maas=klavye.nextInt(); System.out.println("Kira:"); kira=klavye.nextInt();
	 * System.out.println("Fatura:"); fatura=klavye.nextInt();
	 * System.out.println("Mutfak harcamaları:"); mutfak=klavye.nextInt();
	 * harcama=fatura+mutfak+kira; kalan=maas-harcama; if (maas>harcama)
	 * System.out.println(kalan+ "paran kaldı."); else System.out.println(kalan+
	 * "borçlusun.");
	 */
	/*
	 * int yas; System.out.println("Yaşınızı giriniz:"); yas=klavye.nextInt(); if
	 * (0<=yas && yas<=3) System.out.println("Evde."); if (4<=yas && yas<=6)
	 * System.out.println("Kreş."); if (7<=yas && yas<=10)
	 * System.out.println("İlköğretim."); if (11<=yas && yas<=14)
	 * System.out.println("Ortaöğretim."); if (15<=yas && yas<=18)
	 * System.out.println("Lise."); if (18<yas)
	 * System.out.println("Üniversite ya da çalışıyor.");
	 */
	/*
	 * byte yas=giris.nextByte(); String sonuc; if (yas<=3) sonuc="Evdedir.";
	 * System.out.println(sonuc);
	 */

int kenar1,kenar2,kcevre,kalan,dcevre,dalan;
System.out.println("Birinci kenarı giriniz:");
kenar1=klavye.nextInt();
System.out.println("İkinci kenarı giriniz:");
kenar2=klavye.nextInt(); 
if (kenar1==kenar2) {
	System.out.println("Bu bir karedir");
	kcevre=kenar1*4;
	kalan=kenar1*kenar1
	System.out.println("Karenin çevresi:"+kcevre);
	System.out.println("Karenin alanı:"+kalan);}
else System.out.println("Bu bir dikdörtgendir."); 
{
	
}
	}
}
