import kolekcije.*;

public class Main {
	public static void main(String[] args) {
		Magacin m = new Magacin(10);
		
		for (int i = 0; i < 10; i++) {
			m.push((int)(10*Math.random()));
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(m.pop());
		}
	}
}
