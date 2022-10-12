
public class Student {
	public static final int brIsp = 30;
	
	private int[] ocene;
	private String ime;
	private String prezime;
	
	public Student() {}
	public Student(int[] o)
	{
		ocene = o;
		
	}
	public int[] getOcene() throws NemaOcena 
	{
		if(ocene == null)
			throw new NemaOcena("Nema Ocena");
		return ocene;
	}
}
