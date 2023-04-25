
public class WebDeveloper extends zaposleni{

	private String[] tehnologije;
	public WebDeveloper(String ime, String prezime, double plata, String[] t) {
		super(ime, prezime, plata);
		tehnologije = t;
	}
	@Override
	public void print() {

		for (String string : tehnologije) {

			System.out.println(string);
		}
		
	}
	@Override
	public double bonus() {
		try {
			double b = plata*0.2;
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
