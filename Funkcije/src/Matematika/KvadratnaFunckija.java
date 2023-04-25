package matematika;

public class KvadratnaFunckija implements Funkcija {

	private double a,b,c;
	public KvadratnaFunckija()
	{
		a=b=c=0;
	}
	public KvadratnaFunckija(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public double vrednost(double tacka) {
		
		return a*tacka*tacka + b*tacka + c;
	}

	@Override
	public boolean imaRealNule() {
		
		return (b*b - 4*a*c) >= 0;
	}

	@Override
	public double[] nule() {
		if (imaRealNule()) {
			if ((b*b - 4*a*c) == 0) {
				double[] pom = new double[1];
				pom[0] = -(b/2*a);
				return pom;
			}
			else 
			{
				double[] pom = new double[2];
				pom[0] = -(b+Math.sqrt(b*b -a*4*c))/ 2*a;
				pom[1] = -(b-Math.sqrt(b*b -a*4*c))/ 2*a;
				
				return pom;
			}
		}
		else 
			return null;
		   
	}

}
