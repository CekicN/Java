package matematika;

public class LinearnaFunkcija implements Funkcija{

	private double a,b;
	public LinearnaFunkcija()
	{
		a=b=0;
	}
	public LinearnaFunkcija(double x)
	{
		a=b=x;
	}
	
	public LinearnaFunkcija(double x, double y)
	{
		a=x;
		b = y;
	}
	
	@Override
	public double vrednost(double tacka) {
		return a*tacka + b;
	}

	@Override
	public boolean imaRealNule() {
		
		return a != 0;
	}

	@Override
	public double[] nule() {
		if (imaRealNule()) {
		    double[] pom = new double[1];
		    pom[0] = -b/a;
		    return pom;
		}
		else 
			return null;
		
	}
	
}