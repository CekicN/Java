
public class Glavna {

	public static void main(String[] args) {
		Agencija a = new Agencija("Agencija");
		
		String[] izleti = new String[3];
		izleti[0] = "rre";
		izleti[1] = "dadaa";
		izleti[2] = "darae";
		Letovanje l = new Letovanje("Kusadasi", "25.07.2022", 10,50,550,901);
		Zimovanje z = new Zimovanje("Kopaonik", "24.12.2022", 10, 5,10, 10);
		Seminar s = new Seminar("FruskaGora", "15.2.2022", 5, 48, 78,izleti);

		
		try {
			a.dodaj(l);
			a.dodaj(z);
			a.dodaj(s);
		} catch (TripTooExpensive e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		a.ispis();
		a.sortiraj();
		a.ispis();
		a.upisi();		
		
	}

}
