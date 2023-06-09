
public class Kvadar extends Telo{

	public Kvadar()
	{
		super();
	}
	public Kvadar(double baza, double visina)
	{
		super(baza, visina);
	}
	@Override
	public double povrsina() {
		return (baza*2) + 4*(visina * Math.sqrt(baza));
	}

	@Override
	public double zapremina() {
		return baza*visina;
	}

}
