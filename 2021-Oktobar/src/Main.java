import mat.*;
public class Main {
	public static void main(String[] args) {
		RealVekt v1 = new RealVekt();
		RealVekt v2 = new RealVekt();
		
		try {
			v1.ucitaj("fajl1.txt");
		} catch (NultiVektor e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			v2.ucitaj("fajl2.txt");
		} catch (NultiVektor e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(v1.suma() > v2.suma())
			v1.stampaj();
		else
			v2.stampaj();
	}
}
