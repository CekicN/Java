import java.io.*;
public class txtRucno {

	private String red;
	
	public txtRucno()
	{
		red = "Nista nije ucitano";
	}
	public void citaj(String file)
	{
		try {
			FileReader f = new FileReader(file);
			BufferedReader b = new BufferedReader(f);
			
			red = b.readLine();
			b.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(red);
	}
}
