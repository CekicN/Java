import java.io.*;
public class CitajPisiBin {
	
	public void upis()
	{
		try {
			FileOutputStream f = new FileOutputStream("fajl.bin");
			BufferedOutputStream b = new BufferedOutputStream(f);
			DataOutputStream d = new DataOutputStream(b);
			
			d.writeInt(10);
			d.writeFloat(2.2f);
			d.writeBoolean(true);
			
			d.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public void citanje()
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream("fajl.bin");
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			
			int celi = dis.readInt();
			float real = dis.readFloat();
			boolean log = dis.readBoolean();
			
			dis.close();
			
			System.out.println(celi + ", " + real + ", " + log);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
