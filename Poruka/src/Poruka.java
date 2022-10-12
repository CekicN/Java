
public class Poruka {
	private String tekst;
	private static int br_poruka = 0;

	public Poruka(String tekst)
	{
		this.tekst = tekst;
		br_poruka++;
	}
	public void prikazi()
	{
		System.out.println(tekst);
	}
	public int Broj() {return br_poruka;}
}
