
public class NasaKlasa implements Comparable {
	private int b;
	
	public NasaKlasa(int b)
	{
		this.b= b;
	}
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	@Override
	public int compareTo(Object o) {
		return b -((NasaKlasa)o).b;
	}
	
}
