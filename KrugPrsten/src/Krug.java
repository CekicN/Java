
public class Krug {
	private double r;
	
	public Krug(double r)
	{
		this.r = r;
	}
	
	public double pov() {
		return Math.pow(r, 2)*Math.PI;
	}
}
