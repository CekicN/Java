
public class Valjak extends Telo{

	public Valjak(double baza, double visina)
	{
		super(baza,visina);
	}
	@Override
	public double povrsina() {
		double r = Math.sqrt(baza/Math.PI);
		return baza*2 + 2*r*Math.PI*visina;
	}

	@Override
	public double zapremina() {
		// TODO Auto-generated method stub
		return baza*visina;
	}

}
