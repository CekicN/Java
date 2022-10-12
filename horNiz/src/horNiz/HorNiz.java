package horNiz;
import java.io.*;
public class HorNiz {
	private int[] niz;
	private String red;
	
	public void citaj(String fajl)
	{
		try {
			FileReader f = new FileReader(fajl);
			BufferedReader b = new BufferedReader(f);
			
			red = b.readLine();
			b.close();
			String pom[] = red.split(",");
			niz = new int[pom.length];
			for (int i = 0; i < pom.length; i++) {
				niz[i] = Integer.parseInt(pom[i]);
			}
			for (int i = 0; i < pom.length; i++) {
				System.out.println(niz[i]);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
