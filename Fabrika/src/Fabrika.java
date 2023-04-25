import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Fabrika {

	private int brTraka;
	private Kolekcija<ProizvodnaTraka> kolekcija;
	
	public Fabrika(int br) {
	    brTraka = br;
		kolekcija = new Kolekcija<>(brTraka);
	}
	public void dodaj(ProizvodnaTraka t)
	{
		kolekcija.dodaj(t);
	}
	public String toString()
	{
		return brTraka +" "+ kolekcija.Countof("lizalica")+" "+ kolekcija.Countof("Cokoladica")+" "+kolekcija.Countof("Smoki");
	}
	public void upis(String filename)
	{
		FileWriter f;
		try {
			f = new FileWriter(filename);

			BufferedWriter bw = new BufferedWriter(f);
			bw.newLine();
			bw.write(kolekcija.toString());
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
