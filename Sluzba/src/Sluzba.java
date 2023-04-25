
public class Sluzba {

	public static double prosek(Student s) throws NemaOcena, FaliStudent
	{
		if (s == null) {
			throw new FaliStudent("Nema studenta");
		}
	     int[] niz;
	     
	     niz = s.vratiOc();
	     if (niz == null) {
			throw new NemaOcena("Nema Ocena");
		}
	     int zbir = 0;
	     
	     for (int i = 0; i < s.brIsp; i++) {
			zbir += niz[i];
		}
	     
		return zbir/(double)s.brIsp;
	}
}
