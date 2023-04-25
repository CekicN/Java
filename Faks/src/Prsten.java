
public class Prsten extends Krug {

	private double ru;
	public Prsten(double r1, double r2)
	{
		super(r1);
		ru = r2;
	}
	
	public double pov()
	{
		System.out.println("Prstenov pov");
		return super.pov() - (Math.pow(ru, 2) * Math.PI);
	}

}
