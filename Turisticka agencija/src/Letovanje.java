
public class Letovanje extends Putovanje{
    
	private int cena_trajekta;
	
	
	public Letovanje(String naziv_destinacije, String datum, int trajanje, int cena_smestaja, int cena_puta, int cena_trajekta) 
	{
		super(naziv_destinacije, datum, trajanje, cena_smestaja, cena_puta);
		this.cena_trajekta = cena_trajekta;
	}
	
	@Override
	void stampaj() {
		System.out.println(naziv_destinacije +", "+ datum+", "+trajanje + ", " + cena_smestaja + ", "+ cena_puta+", "+ cena_trajekta);
	}

	@Override
	int ukupna_cena() {
		return super.cenaputa()+cena_trajekta;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return naziv_destinacije +", "+ datum+", "+trajanje + ", " + cena_smestaja + ", "+ cena_puta+", "+ cena_trajekta;
	}
}
