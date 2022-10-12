package mat;
import java.io.*;
import java.util.Iterator;
public abstract class Vektor implements Comparable<Vektor>{
	protected double[] vektor;
	private int kap;
	
	public void ucitaj(String fajl) throws NultiVektor
	{
		try {
			FileReader f = new FileReader(fajl);
			BufferedReader b = new BufferedReader(f);
			
			kap = Integer.parseInt(b.readLine());
			vektor = new double[kap];
			
			boolean jesu = true;
			for (int i = 0; i < vektor.length; i++) {
				vektor[i] = Double.parseDouble(b.readLine());
				if(vektor[i] != 0)
					jesu = false;
			}
			if (jesu) {
				throw new NultiVektor("Svi elementi su nule!");
			}
			b.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public abstract double proizvod();
	public int compareTo(Vektor v)
	{
		if(proizvod() > v.proizvod())
			return 1;
		else if(proizvod() < v.proizvod())
			return -1;
		else
			return 0;
	}
}
