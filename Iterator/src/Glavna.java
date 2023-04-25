
public class Glavna {

	public static void main(String[] args) {
		KlasaIterator k1 = new KlasaIterator(5);
		
		k1.dodajElement(5);
		k1.dodajElement(1.5f);
		k1.dodajElement("aaa");
		
		System.out.println("Popunjenost:" + k1.broj());

		k1.stampajTrenutni();
		k1.sledeci();
		k1.naPocetak();
		k1.stampajTrenutni();
		k1.sledeci();
		k1.stampajTrenutni();
		
	}

}
