
public class Main {
	public static void main(String[] args) {
		Integer iniz[] = new Integer[3];
		
		iniz[0] = 0;
		iniz[1] = 1;
		iniz[2] = 2;
		
		System.out.println(Brojac.pobroj(iniz, 1));
		
		
		NasaKLasa a[] = new NasaKLasa[3];
		
		a[0] = new NasaKLasa(0);
		a[1] = new NasaKLasa(1);
		a[2] = new NasaKLasa(2);
		
		System.out.println(Brojac.pobroj(a, new NasaKLasa(0)));
	}
}
