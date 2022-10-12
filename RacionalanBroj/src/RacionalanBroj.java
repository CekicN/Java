
public class RacionalanBroj {
	private int br,im;
	public RacionalanBroj(int b, int i)throws DeljenjeNulom
	{
		if (i == 0) {
			throw new DeljenjeNulom("delis s 0");
		}
		br = b;
		im = i;
	}
	
}
