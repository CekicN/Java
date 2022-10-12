import Matematika.*;

public class Main {

	public static void main(String[] args) {
		Funkcija k1, k2;
		
		k1 = new LinearnaFunkcija(1.1, 2.2);
		k2 = new KvadratnaFunckija(1.1, 5.5, 3.3);
		
		System.out.println(k1.vrednost(2.5));
		System.out.println(k2.vrednost(2.5));
		
		System.out.println(k1.nule()[0]);
		System.out.println(k2.nule()[0]+ ", " + k2.nule()[1]);

	}

}
