
public class Student {

	public static final int brIsp = 30;
	private int[] ocene;
	private String Ime;
	private String Prezime;
	
	public Student(int[] oc)
	{
		ocene = oc;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int[] vratiOc() throws NemaOcena
	{
		return ocene;
	}
}
