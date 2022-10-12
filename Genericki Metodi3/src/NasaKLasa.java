
public class NasaKLasa implements Comparable<NasaKLasa>{
	
	private int broj;

	

	public NasaKLasa(int broj) {
		super();
		this.broj = broj;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	@Override
	public int compareTo(NasaKLasa o) {
		// TODO Auto-generated method stub
		return broj - o.getBroj();
	}
}	
