import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		
		li.add(5);
		li.add(3);
		li.add(1);
		li.sort(null);
//		Collections.sort(li);
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println();
		ArrayList<NasaKlasa> l = new ArrayList<>();
		
		l.add(new NasaKlasa(2));
		l.add(new NasaKlasa(5));
		l.add(new NasaKlasa(8));
		l.add(new NasaKlasa(3));
		l.sort(null);
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getB());
		}
	}
}
