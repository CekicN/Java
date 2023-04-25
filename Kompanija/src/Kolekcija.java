import java.util.Collection;
import java.util.Iterator;

public class Kolekcija <T extends zaposleni>{

	private int n;
	private int brEl;
	private zaposleni[] niz;
	
	public Kolekcija(int n) {
		this.n = n;
		niz = new zaposleni[n];
		brEl = 0;
	}
	
	public void dodaj(T el)
	{
		if (brEl < n) {
			niz[brEl++] = el;
		}
	}
	
	public void Brisi(T El)
	{

		for (int i = 0; i < niz.length; i++) {
			if (niz[i].equals(El)) {
			for (int j = i; j < niz.length-1; j++) {
				niz[j] = niz[j+1];
			}
			}
		}
	}
	
	
}
