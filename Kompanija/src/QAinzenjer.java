
public class QAinzenjer extends zaposleni {

	private int brTestova;
	public QAinzenjer(String ime, String prezime, double plata, int br) {
		super(ime, prezime, plata);
		brTestova = br;
	}
	@Override
	public void print() {
		System.out.println(brTestova);
		
	}
	@Override
	public double bonus() {
		try {
			double b = plata*0.1;
			if (b > 100000) {
				throw new BonusTooBig("prevelik bonus");
			}
			return b;
		} catch (BonusTooBig e) {
			System.out.println(e);
		}
		return plata;
	}

}
