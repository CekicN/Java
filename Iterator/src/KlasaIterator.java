
public class KlasaIterator implements Iterator{

	private Object[] niz;
	private int trenutniEl;
	private int popunjenost;
	private int kapacitet;
	
	public KlasaIterator(int kap)
	{
		kapacitet = kap;
		trenutniEl = 0;
		popunjenost = 0;
		niz = new Object[kap];
	}
	@Override
	public void dodajElement(int el) {
		
		Integer inEl = new Integer(el);
		niz[trenutniEl++] = inEl;
		popunjenost++;
	}

	@Override
	public void dodajElement(float el) {
		Float flEl = new Float(el);
		niz[trenutniEl++] = flEl;
		popunjenost++;
		
	}

	@Override
	public void dodajElement(String el) {
		String stringEl = new String(el);
		niz[trenutniEl++] = stringEl;
		popunjenost++;
	}

	@Override
	public void stampajTrenutni() {
		System.out.println(niz[trenutniEl-1]);
		
	}

	@Override
	public int broj() {
		
		return popunjenost;
	}

	@Override
	public void sledeci() {

		if (trenutniEl < popunjenost) {
			trenutniEl++;
		}
		else
			System.out.println("Overflow");
	}

	@Override
	public void naPocetak() {
		trenutniEl = 1;
	}

}
