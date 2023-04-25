
public abstract class zaposleni {

	protected String ime;
	protected String prezime;
	protected double plata;
	
	public zaposleni(String ime, String prezime, double plata) {

		this.ime = ime;
		this.prezime = prezime;
		this.plata = plata;
	}
	public abstract void print();
	public abstract double bonus();
}
