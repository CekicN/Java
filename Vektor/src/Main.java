import nizovi.*;
public class Main {
	public static void main(String[] args) {
		Vektor v1, v2;
		
		v1 = new Vektor();
		v2 = new Vektor();
		
		v1.CitanjeVer("Neuredjeni.txt");
		v1.sort();
		v1.pisiBin("UredjeniBin.dat");
		
		v2.CiranjeBin("UredjeniBin.dat");
		v2.PisiHor("ured.txt");
	}
}
