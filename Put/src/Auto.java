import java.io.*;
public class Auto {
	private String tablica;
	private String marka;
	private int ccm;
	
	public Auto(BufferedReader b)
	{
		try 
		{
			tablica = b.readLine();
			marka   = b.readLine();
			ccm     = Integer.parseInt(b.readLine());
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void stampaj()
	{
		System.out.println(tablica+" " + marka +" " + ccm);
	}
}
