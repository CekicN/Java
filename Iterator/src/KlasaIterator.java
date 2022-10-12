
public class KlasaIterator implements Iterator{

	private Object[] niz;
	
	private int tmp;
	private int max;
	private int pop;
	
	public KlasaIterator(int max)
	{
		this.max = max;
		tmp = 0;
		pop = 0;
		niz = new Object[max];
	}
	@Override
	public void dodajElement(int e) {
		Integer intEl = new Integer(e);
		
		niz[tmp++] = intEl;
		pop++;
	}

	@Override
	public void dodajElement(float e) {
		Float floatEl = new Float(e);
		
		niz[tmp++] = floatEl;
		pop++;	
		
	}

	@Override
	public void dodajElement(String e) {
		niz[tmp++] = e;
		pop++;
		
	}

	@Override
	public int broj() {
		return pop;
	}

	@Override
	public void sledeci() {
		if(tmp < pop)
		{
			tmp++;
		}
		else 
			System.out.println("Overflow");
		
	}

	@Override
	public void naPocetak() {
		tmp = 0;
		
	}
	public void stampaj() {
		System.out.println(niz[tmp]);
		
	}

}
