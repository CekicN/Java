import java.io.*;
public class Txt {
	
	private String ime;
	public Txt()
	{
		InputStreamReader tast = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(tast);
		try {
			ime = b.readLine();
			b.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void citaj()
	{
		try {
			FileReader f = new FileReader(ime);
			BufferedReader b = new BufferedReader(f);
			
			String red = b.readLine();
			b.close();
			System.out.println(red);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void pisi()
	{
		try {
			FileWriter f = new FileWriter(ime);
			BufferedWriter b = new BufferedWriter(f);
			
			b.write("recenica neka");
			b.newLine();
			b.write("Ona mene ja njuma");
			b.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
