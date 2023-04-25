
public class Seminar extends Putovanje {
 
	private String[] izleti;
	
	public Seminar(String naziv_destinacije, String datum, int trajanje, int cena_smestaja, int cena_puta, String[] izleti) {
		super(naziv_destinacije, datum, trajanje, cena_smestaja, cena_puta);
		this.izleti = izleti;
	}

	@Override
	void stampaj() {
		 String tekst = naziv_destinacije +", "+ datum+", "+trajanje + ", " + cena_smestaja + ", "+ cena_puta;
			for (int i = 0; i< izleti.length; i++ )
			{
			 tekst += ", " + izleti[i];	
			}
		System.out.println(tekst);
		
	}

	@Override
	int ukupna_cena() {
		
		return super.cenaputa();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
        String tekst = naziv_destinacije + ", " + datum + ", " + trajanje + ", " + cena_smestaja + ", " + cena_puta;
		for (int i = 0; i< izleti.length; i++ )
		{
		 tekst += ", " + izleti[i];	
		}
		return tekst;
	}
}
