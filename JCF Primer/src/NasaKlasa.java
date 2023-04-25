
public class NasaKlasa implements Comparable {

	private int b;
	public NasaKlasa(int b) {
	this.setB(b);
}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public int compareTo(Object o) {
		if (b < ((NasaKlasa)o).b) {
			return -1;
		}
		else if (b > ((NasaKlasa)o).b) {
			return 1;
		}
		else
			return 0;
		
	}
	public String toString()
	{
		return String.valueOf(b);
	}
}
