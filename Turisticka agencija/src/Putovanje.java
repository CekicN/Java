
public abstract class Putovanje implements Comparable<Putovanje> {

	protected String naziv_destinacije;
	protected String datum;
	protected int trajanje;
	protected int cena_smestaja;
	protected int cena_puta;
	
	
	abstract void stampaj();
	abstract int ukupna_cena();
	public abstract String toString();
	 
	public Putovanje(String naziv_destinacije, String datum, int trajanje, int cena_smestaja, int cena_puta )
	{
		this.naziv_destinacije = naziv_destinacije;
		this.datum = datum;
		this.trajanje = trajanje;
		this.cena_smestaja = cena_smestaja;
		this.cena_puta = cena_puta;
	
	}
	public int cenaputa()
	{
		return cena_puta+cena_smestaja*trajanje;
	}
	public int Getcena_puta() {return cena_puta;}
	@Override
	public int compareTo(Putovanje o) {
		int  cena = o.Getcena_puta();
		return this.cena_puta - cena;
	}

}
