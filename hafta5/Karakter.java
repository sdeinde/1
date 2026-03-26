package hafta5;

public class Karakter {

	public static void main(String[] args) {
		String cumle="Okan Üniversitesi";
		String ad="               Ali                 ";
		System.out.println("|"+ad+"|");
		System.out.println("|"+ad.trim()+"|");
		System.out.println(cumle.toUpperCase());
		System.out.println(cumle.toLowerCase());
		System.out.println("cumle.charAt(0): "+cumle.charAt(0));
		System.out.println("cumle.charAt(5): "+cumle.charAt(5));
		System.out.println(cumle.contains("üni"));
		System.out.println(cumle.contains("Üni"));
		System.out.println(cumle.endsWith("si"));
		System.out.println(cumle.indexOf("v"));
		System.out.println(cumle.isEmpty());
		System.out.println(cumle.length());
		System.out.println(cumle.repeat(3));
		String kelime[]=cumle.split("i");
		for (int i= 0;  i< kelime.length; i++) {
			System.out.println(kelime[i]);
		}
		String yeniCumle=cumle.replaceAll("i", "I");
		System.out.println(yeniCumle);
		System.out.println(cumle.startsWith("Ok"));
		System.out.println(cumle.startsWith("ka"));
		String ad1="ali";
		String ad2="Ali";
		String ad11="ahmet";
	}

}
