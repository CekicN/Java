
public class Main {

	public static void main(String[] args) {
		KlasaIterator k1 = new KlasaIterator(5);
		
		k1.dodajElement(1);
		k1.dodajElement(1.1f);
		k1.dodajElement("aaa");
		
		System.out.println(k1.broj());
		
		k1.sledeci();
		k1.naPocetak();
		k1.stampaj();
		k1.sledeci();
		k1.stampaj();
	}

}
