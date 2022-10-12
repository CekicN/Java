
public abstract class Display {
	protected int cifra;
	
	public Display()
	{
		cifra = 0;
	}
	
	public Display(int c)
	{
		if(c != 0 && c != 1)
		{
			cifra = 0;
		}
		else 
			cifra = c;
	}
	
	public abstract void stampaj();
}
