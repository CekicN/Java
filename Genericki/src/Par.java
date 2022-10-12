
public class Par <K, V>{
	private K kljuc;
	private V vrednost;
	
	public Par(K kljuc, V v)
	{
		this.kljuc = kljuc;
		vrednost = v;
	}

	public K getKljuc() {
		return kljuc;
	}

	public void setKljuc(K kljuc) {
		this.kljuc = kljuc;
	}

	public V getVrednost() {
		return vrednost;
	}

	public void setVrednost(V vrednost) {
		this.vrednost = vrednost;
	}

}
