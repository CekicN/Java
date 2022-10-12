package algebra;

import java.io.*;

public class Razlomak extends Broj{

	private int brojilac,im;
	
	public void ucitaj(String b,String i)
	{
		brojilac = super.ucitaj(b);
		im = super.ucitaj(i);
	}

	@Override
	public double vrednost() {
		
		return brojilac/(double)im;
	}
	
	public void upisi(String fajl)
	{
		try {
			FileOutputStream f = new FileOutputStream(fajl);
			BufferedOutputStream b = new BufferedOutputStream(f);
			DataOutputStream d = new DataOutputStream(b);
			
			d.writeDouble(this.vrednost());
			d.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
