package kolekcije;

public class Magacin {
	private Object[] niz;
	private int tmp;
	private int kap;
	
	public Magacin(int kap)
	{
		tmp = -1;
		this.kap = kap;
		niz = new Object[kap];
	}
	
	public void push(Object o)
	{
		if (++tmp < kap) {
			niz[tmp] = o;
		}
		else
			System.out.println("Pun je");
		
	}
	public Object pop()
	{
		if (!prazanJe()) {
			return niz[tmp--];
		}
		else
		{
			System.out.println("Prazan je");
		}
		return null;
	}
	
	public boolean prazanJe()
	{
		return tmp==-1;
	}
}