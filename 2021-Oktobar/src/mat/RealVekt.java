package mat;

import java.io.*;

public class RealVekt extends Vektor{

	public double suma()
	{
		double s = 0;
		for (int i = 0; i < vektor.length; i++) {
			s += vektor[i];
		}
		return s;
	}
	public void upisi(String fajl)
	{
		try {
			FileOutputStream f = new FileOutputStream(fajl);
			BufferedOutputStream b = new BufferedOutputStream(f);
			DataOutputStream d= new DataOutputStream(b);
			d.writeDouble(this.suma());
			d.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	@Override
	public double proizvod() {
		double p = 1;
		for (int i = 0; i < vektor.length; i++) {
			p *= vektor[i];
		}
		return p;
	}
	public void stampaj()
	{
		for (int i = 0; i < vektor.length; i++) {
			System.out.print(vektor[i] + ", ");
		}
	}
}
