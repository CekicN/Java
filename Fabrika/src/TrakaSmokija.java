
public class TrakaSmokija extends ProizvodnaTraka {

	public TrakaSmokija(int sifra, int sprat, int n, String imeServisera) {
		super(sifra, sprat, n, imeServisera);
		// TODO Auto-generated constructor stub
	}

	public double start(double kol)
	{
		try {
			if (kol>n) {
				throw new MaximuCapacityExceeded("Previse smokija");
			}
			super.start();
			return kol;
		} catch (MaximuCapacityExceeded e) {
			System.out.println(e);
		}
		return kol*0.5;
	}
}
