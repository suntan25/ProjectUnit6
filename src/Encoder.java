
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Encoder {
	
	
	File file;
	
	public Encoder(String filename)
	{
		file =  new File(filename);
		
	}
	
	public void write(String plaintext)
	{
		try {
			PrintWriter p = new PrintWriter(file);
/*			
			for(String s: myData.keySet()){
				p.print(s);
				
				for(String d: myData.get(s)){
					p.print("\t");
					p.print(d);
				}
				p.println();
			}
*/			
			
			
			p.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public List<String> read()
	{	ArrayList<String> readIt = new ArrayList<String>();
		try {
			Scanner scan = new Scanner(file);
			
			while(scan.hasNextLine()){
				String[] line = scan.nextLine().split("\\t");
				readIt.add(line[0]);
				readIt.add(line[1]);			
			}
					
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return readIt;
	}
	
	
}
