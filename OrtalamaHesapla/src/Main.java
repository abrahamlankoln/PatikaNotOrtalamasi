import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Main {

	public static void main(String[] args) {
		int matematik, fizik, kimya, turkce, tarih, muzik;

		Scanner deger = new Scanner(System.in);

		System.out.print("matematik notunuzu giriniz: ");
		matematik = deger.nextInt();
		
		System.out.print("fizik notunuzu giriniz: ");
		fizik= deger.nextInt();
		
		System.out.print("kimya notunuzu giriniz: ");
		kimya = deger.nextInt();
		
		System.out.print("türkçe notunuzu giriniz: ");
		turkce = deger.nextInt();
		
		System.out.print("tarih notunuzu giriniz: ");
		tarih = deger.nextInt();
		
		System.out.print("müzik notunuzu giriniz: ");
		muzik = deger.nextInt();

		double sonuc = (matematik+fizik+kimya+turkce+tarih+muzik)/6;
		System.out.println("ortalamanız: "+sonuc);
		String yazi = (sonuc >= 60) ? "geçtiniz": "kaldınız:";
        System.out.println(yazi);
		
	}

}
