
public class ProizvodnaTraka {

	protected int sifra;
	protected int sprat;
	protected boolean aktivna;
	protected int n;
	protected String imeServisera;
	public ProizvodnaTraka(int sifra, int sprat, int n, String imeServisera) {
	
		this.sifra = sifra;
		this.sprat = sprat;
		this.aktivna = false;
		this.n = n;
		this.imeServisera = imeServisera;
		
    }
	public void start()
	{
		System.out.println("Pocela je sa radom");
		aktivna = true;
	}
	public void stop()
	{
		System.out.println("Zaustavljena je sa radom");
	
		aktivna = false;

	}
	public Integer GetSifra() {
		Integer t = new Integer(sifra);
		return t;
	}
	public String toString()
	{
		return "sifra:" + sifra + "sprat:"+ sprat + "aktivna:" + aktivna +"ImeServisera:" + imeServisera+"\n";
	}
}
