package Matematika;

public class LinearnaFunkcija implements Funkcija {

	private double a,b;
	
	public LinearnaFunkcija()
	{
		a = b = 0;
	}
	public LinearnaFunkcija(double x)
	{
		a = b = x;
	}
	public LinearnaFunkcija(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	@Override
	public double vrednost(double tacka) {
		
		return a*tacka + b;
	}

	@Override
	public boolean realneNule() {
		return a != 0;
	}

	@Override
	public double[] nule() {
		if (realneNule()) {
			double[] pom = new double[1];
			pom[0] = -b/a;
			return pom;
		}
		else
			return null;
	}

}