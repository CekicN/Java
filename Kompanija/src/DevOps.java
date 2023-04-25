
public class DevOps extends zaposleni {

	private String datum;
	public DevOps(String ime, String prezime, double plata, String datum) {
		super(ime, prezime, plata);
		this.datum = datum;
	}
	@Override
	public void print() {
		System.out.println(datum);
		
	}
	@Override
	public double bonus() {
		try {
			double b = plata*0.3;
			if (b > 100000) {
				throw new BonusTooBig("Prevelik bonus");
			}
			return b;
		} catch (BonusTooBig e) {
			System.out.println(e);
		}
		return plata;
	}

}
