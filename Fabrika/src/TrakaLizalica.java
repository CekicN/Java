
public class TrakaLizalica extends ProizvodnaTraka{

	public TrakaLizalica(int sifra, int sprat, int n, String imeServisera) {
		super(sifra, sprat, n, imeServisera);
	}

	public double start(double kol) 
	{
		try {
		
			if (kol>n) {
				super.start();
				throw new MaximuCapacityExceeded("Molim Vas zovite" + imeServisera);
			}
			super.start();
			return kol/0.05;
			} catch (MaximuCapacityExceeded e) {
			System.out.println(e);
		}
		return n/ 0.05;
		
	}
}
