import java.util.Iterator;

public class Kolekcija <T extends ProizvodnaTraka> {

	private ProizvodnaTraka[] niz;
	private int n;
	private int brEl;
	
	public Kolekcija(int n) {

		this.n = n;
		brEl = 0;
		niz = new ProizvodnaTraka[this.n];
	}
	public void dodaj(T el)
	{
		if (brEl < n) {
			niz[brEl++] = el;
		}
	}
	public void Brisi(T el)
	{
	
		int i;
		for ( i = 0; i < niz.length; i++)
		{
			if (niz[i].GetSifra().equals(el.GetSifra())) {
			
				for (int j = i; j < niz.length-1; j++) {
					niz[j] = niz[j+1];
				}
			}
		}
		brEl--;
	}
	public int Countof(String s)
	{
	int c= 0;
	if (s.equals("Smoki")) {
		for (int i = 0; i < niz.length; i++) {

			if (niz[i] instanceof TrakaSmokija) {
			c++;	
			}
		}
	}
	else if (s.equals("Cokoladica")) {
		for (int i = 0; i < niz.length; i++) {

			if (niz[i] instanceof TrakaCokoladica) {
			c++;	
			}
		}
	}
	else if (s.equals("lizalica")) {
		for (int i = 0; i < niz.length; i++) {

			if (niz[i] instanceof TrakaLizalica) {
			c++;	
			}
		}
	}
	return c;
	}
	
	public String toString()
	{
		String info = "";
		for (int i = 0; i < niz.length; i++) {
			info += niz[i].toString() + "\n";
		}
		return info;
	}
	
}
