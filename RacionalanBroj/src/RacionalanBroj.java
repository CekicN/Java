
public class RacionalanBroj {
	private int br, im;
	
	public RacionalanBroj(int br , int im) throws DeljenjeNulom
	{
		if (im == 0) {
			throw new DeljenjeNulom("Delis nulom!");
		}
		this.br = br;
		this.im = im;
		
		
	}

}
