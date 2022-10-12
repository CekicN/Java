
public class Sluzba {
	public static double prosek(Student s) throws NemaOcena, NemaStudenta
	{
		if(s == null)
			throw new NemaStudenta("Nema Studenta");
		int[] niz = s.getOcene();
		double a = 0;
		for (int i = 0; i < niz.length; i++) {
			a+= niz[i];
		}
		return a/(double)niz.length;	
	}
}
