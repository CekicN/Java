
public class Glavna {

	public static void main(String[] args) {
	
		NasaKlasa iniz[] = new NasaKlasa[3];
		iniz[0] = new NasaKlasa(0);
		iniz[1] = new NasaKlasa(1);
		iniz[2] = new NasaKlasa(3);
		System.out.println(Brojac.pobroj(iniz, new NasaKlasa(1)));
	}
}
