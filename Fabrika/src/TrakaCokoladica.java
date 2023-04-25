
public class TrakaCokoladica extends ProizvodnaTraka {

	public TrakaCokoladica(int sifra, int sprat, int n, String imeServisera) {
		super(sifra, sprat, n, imeServisera);
		// TODO Auto-generated constructor stub
	}
	public double start(double kol)
	{
		try {
		
			if (kol > n) {
				throw new MaximuCapacityExceeded("Prekoracenje");
			}
			super.start();
			return kol*1.5;
		} catch (MaximuCapacityExceeded e) {
			System.out.println(e);
		}
		return n*1.5;
		
	}

}
