package kolekcije;

public class Magacin {
	private Object niz[];
	private int trenutni;
	private int kapacitet;
	
	public Magacin(int kap)
	{
		kapacitet = kap;
		niz = new Object[kapacitet];
		trenutni = 0;
	
	}
	
	public void push(Object o)
	{
        if (trenutni < kapacitet) 
        {
        	niz[trenutni++] = o;	
		}
        else
        {
        	System.out.println("Pun je!!!");
        }
	}
	public Object pop()
	{
		if (!prazanje()) {
			trenutni--;
			return niz[trenutni];	
		}
		else
		{
		   System.out.println("Prazan je!!!");
			return null;
		}
		
		
		
	}

	public boolean prazanje()
	{
		if (trenutni == 0) {
			return true;
		}
		else
			return false;
	}
}
