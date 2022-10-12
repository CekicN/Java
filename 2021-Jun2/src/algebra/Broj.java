package algebra;
import java.io.*;
public abstract class Broj implements Comparable<Broj> {
	private int br;
	public int getBr() {
		return br;
	}
	public void setBr(int br) {
		this.br = br;
	}
	public int ucitaj(String fajl)
	{
		try {
			FileReader f = new FileReader(fajl);
			BufferedReader b = new BufferedReader(f);
			
			br = Integer.parseInt(b.readLine());
			b.close();
			return br;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return br;
	}
	public abstract double vrednost();
	public int compareTo(Broj o) {
		
		return (int)(this.vrednost() - o.vrednost());
	}	
	
}
