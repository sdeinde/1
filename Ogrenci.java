import java.util.Scanner;

public class Ogrenci {

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		System.out.println("Öğrenci sayısı giriniz : ");
		byte os=giris.nextByte();
		String ad[]=new String[os];
		byte []vn=new byte[os];
		byte []fn=new byte[os];
		byte []bn=new byte[os];
		Fonksiyonlar.VeriAlma(giris,ad,vn,fn,bn);
		for(;;) {
			byte menu=Fonksiyonlar.MenuAl(giris);
			switch (menu) {
			case 0:System.out.println("Program bitti");
				System.exit(0);
				break;
			case 1:Fonksiyonlar.Listeleme(ad,vn,fn,bn);break;
			
			case 2:System.out.println("aranacak Adı giriniz : ");
				String arananAd=giris.next();
				Fonksiyonlar.AdArama(arananAd,ad,vn,fn,bn);break;
			case 3:Fonksiyonlar.Ortalama(vn,fn,bn);break;
			default:
				break;
			}
		}
	}

}
