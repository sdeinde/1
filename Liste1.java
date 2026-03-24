package hafta3;

import java.util.ArrayList;

public class Liste1 {

	public static void main(String[] args) {
		ArrayList<String> ad=new ArrayList<String>();
		System.out.println(ad);
		ad.add("Ali");
		System.out.println(ad);
		ad.add("Ayşe");//listenin sonuna eleman ekler
		System.out.println(ad);
		ad.set(1, "Mehmet");//belirtilen indisteki kaydı değiştirir
		System.out.println(ad);
		ad.add("Nuray");
		System.out.println(ad);
		ad.add("Uygar");
		System.out.println(ad);
		Object[] veri=ad.toArray();//listeyi diziye çevirir                              
		System.out.println("veri: "+veri[0]);
		System.out.println("ad: "+ad);
		String silinenAd=ad.remove(0);
		System.out.println("ad: "+ad);
		System.out.println("silinen ad: "+silinenAd);
		ad.clear();
		System.out.println("ad: "+ad);
		System.out.println(ad.contains("Mehmet"));
		System.out.println(ad.contains("Nurten"));
		System.out.println(ad.size());
		//System.out.println(ad.get(0));
		System.out.println(ad.indexOf("Mehmet"));
		System.out.println(ad.isEmpty());
		
		
	}

}
