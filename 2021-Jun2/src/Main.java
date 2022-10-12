import algebra.*;
public class Main {
	public static void main(String[] args) {
		Razlomak r1 = new Razlomak();
		Razlomak r2 = new Razlomak();
		
		r1.ucitaj("fajl1.txt", "fajl2.txt");
		r2.ucitaj("fajl3.txt", "fajl4.txt");
		
		if(r1.compareTo(r2) > 0)
		{
			System.out.println(r1.vrednost());
		}
		else
			System.out.println(r2.vrednost());
	}
}
