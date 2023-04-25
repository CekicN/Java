import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Glavna {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		
		l1.add(5);
		l1.add(3);
		l1.add(1);
		l1.sort(null);
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		
		//=========================
		ArrayList<NasaKlasa> l2 = new ArrayList<>();

		l2.add(new NasaKlasa(5));
		l2.add(new NasaKlasa(3));
		l2.add(new NasaKlasa(4));
		l2.add(new NasaKlasa(8));
		
		l2.sort(null);
	
		for (int i = 0; i < l2.size(); i++) {
			System.out.println(l2.get(i));
		}
	}

}
