
public class Zimovanje extends Putovanje {
  
	private int cena_ski;
	
	
	public Zimovanje(String naziv_destinacije, String datum, int trajanje, int cena_smestaja, int cena_puta, int cena_ski) {
		super(naziv_destinacije, datum, trajanje, cena_smestaja, cena_puta);
		this.cena_ski = cena_ski;
	}

	@Override
	void stampaj() {

		System.out.println(naziv_destinacije +", "+ datum+", "+trajanje + ", " + cena_smestaja + ", "+ cena_puta+", "+ cena_ski);
		
	}

	@Override
	int ukupna_cena() {
		return super.cenaputa()+cena_ski;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return naziv_destinacije +", "+ datum+", "+trajanje + ", " + cena_smestaja + ", "+ cena_puta+", "+ cena_ski;
	}
}
