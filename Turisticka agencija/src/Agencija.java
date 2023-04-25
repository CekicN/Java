import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Agencija {
	private String naziv;
	ArrayList<Putovanje>  lista = new ArrayList<Putovanje>();
	
	public Agencija(String naziv)
	{
		this.naziv = naziv;
	}
	public void dodaj(Putovanje p) throws TripTooExpensive
	{
		if(p.ukupna_cena() > 2000)
			throw new TripTooExpensive("Skupo!!");
		lista.add(p);
	}
	public void ispis()
	{
		System.out.println(naziv);
		for (int i = 0; i < lista.size(); i++) {
			lista.get(i).stampaj();
		}
	}
	public void upisi()
	{
		try {
			FileWriter w = new FileWriter("fajl.txt");
			for (int i = 0; i < lista.size(); i++) {
				w.append(lista.get(i).toString()+ "\n");
			}
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void sortiraj()
	{
		lista.sort(null);
	}
}
