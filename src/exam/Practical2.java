package exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Practical2 {

	public static void main(String[] args) throws IOException {
		
		doesFileExist("testData/doesitexist.txt");
		
		String path = "testData/definition.txt";

		File f = new File(path);
		FileReader fw = new FileReader(f); 
		BufferedReader r = new BufferedReader(fw);
		
		
		try {
		String line = r.readLine();
		
			String[] line1 = line.split(" ");
			
			System.out.println( line1[0]);
			System.out.print( line1[1] + " ");
			System.out.println( line1[2]);
			System.out.print( line1[3] + " ");
			System.out.print( line1[4]+" ");
			System.out.print( line1[5]);
			System.out.println();
			
			String line2 = r.readLine();
			
			String[] line2a = line2.split(" ");
			System.out.println( line2a[0]);
			System.out.print( line2a[1] + " ");
			System.out.println( line2a[2]);
			System.out.print( line2a[3] + " ");
			System.out.print( line2a[4]+" ");
			System.out.print( line2a[5]+" ");
			System.out.print( line2a[6]+" ");
			System.out.print( line2a[7]+" ");
			System.out.print( line2a[8]+" ");
			System.out.print( line2a[9]+" ");
			System.out.print( line2a[10]+" ");
			System.out.print( line2a[11]+" ");
			System.out.print( line2a[12]+" ");
			System.out.println();

			String line3 = r.readLine();
		
			String[] line3a = line3.split(" ");
			System.out.println( line3a[0]);
			System.out.print( line3a[1] + " ");
			System.out.println( line3a[2]);
	
	
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}
		
}
	
	public static void doesFileExist(String path) {
		
		try {
			File f = new File(path);
			FileReader fw = new FileReader(f); 
			BufferedReader r = new BufferedReader(fw);

			String line = null;
			while((line = r.readLine())!= null) {
				System.out.println(line);
			}
					
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	}
