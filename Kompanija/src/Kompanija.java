import java.util.Collection;

public class Kompanija {

	private Kolekcija<zaposleni> kolekcija;
	int br;
	public Kompanija(int br) {
		this.br = br;
		kolekcija = new Kolekcija<>(br);
	}
	
	public void sort()
	{

	}
}
