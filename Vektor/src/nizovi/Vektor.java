package nizovi;

import java.io.*;
import java.nio.Buffer;

public class Vektor {
	private int n;
	private float[] niz;

	public void CitanjeVer(String fajl)
	{
		try {
			FileReader f= new FileReader(fajl);
			BufferedReader b = new BufferedReader(f);
			
			n = Integer.parseInt(b.readLine());
			niz = new float[n];
			
			for (int i = 0; i < niz.length; i++) {
				niz[i] = Float.parseFloat(b.readLine());
				System.out.println(niz[i]);
			}
			b.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void CitanjeHor(String fajl)
	{
		try {
			FileReader f= new FileReader(fajl);
			BufferedReader b = new BufferedReader(f);
			
			String e = b.readLine();
			b.close();
			
			String[] pom = e.split(" ");
			n = Integer.parseInt(pom[0]);
			niz = new float[n];
			
			for (int i = 1; i <= n; i++) {
				niz[i-1] = Float.parseFloat(pom[i]);
				System.out.println(niz[i-1]);
			}
			b.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void CiranjeBin(String fajl)
	{
		try {
			FileInputStream f = new FileInputStream(fajl);
			BufferedInputStream b = new BufferedInputStream(f);
			DataInputStream d = new DataInputStream(b);
			
			n = d.readInt();
			niz = new float[n];
			for (int i = 0; i < niz.length; i++) {
				niz[i] = d.readFloat();
				System.out.println(niz[i]);
			}
			d.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void PisiVer(String fajl)
	{
		try {
			FileWriter f = new FileWriter(fajl);
			BufferedWriter b = new BufferedWriter(f);
			b.write(String.valueOf(n));
			b.newLine();
			for (int i = 0; i < n; i++) {
				b.write(String.valueOf(niz[i]));	
				b.newLine();
			}
			b.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	public void PisiHor(String fajl)
	{
		try {
			FileWriter f = new FileWriter(fajl);
			BufferedWriter b = new BufferedWriter(f);
			String s = String.valueOf(n)+ " ";
			for (int i = 0; i < n; i++) {
				s += String.valueOf(niz[i])+ " ";	
			}
			b.write(s);
			b.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	public void pisiBin(String fajl)
	{
		try {
			FileOutputStream f= new  FileOutputStream(fajl);
			BufferedOutputStream b = new BufferedOutputStream(f);
			DataOutputStream d= new DataOutputStream(b);
			
			d.writeInt(n);
			for (int i = 0; i < niz.length; i++) {
				d.writeFloat(niz[i]);
			}
			d.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	public void sort()
	{
		for (int i = 0; i < niz.length-1; i++) {
			for (int j = i+1; j < niz.length; j++) {
				if (niz[i] < niz[j]) {
					float pom= niz[i];
					niz[i] = niz[j];
					niz[j] = pom;
				}
			}
		}
	}
}
