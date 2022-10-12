
public class Prsten extends Krug {

	private double ru;
	public Prsten(double r, double ru) {
		super(r);
		this.ru = ru;
	}
	public double pov()
	{
		return super.pov() - Math.pow(ru, 2)*Math.PI;
	}
}
