
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
	
	public void write(String username, String message)
	{
		try {
			FileWriter p = new FileWriter(file, true);
			
			p.write(username);
			p.write(" ");
			p.write(message);
				
				p.write("\n");
					
			
			p.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public List<String> read()
	{	ArrayList<String> readIt = new ArrayList<String>();
		try {
			Scanner scan = new Scanner(file);
			
			while(scan.hasNextLine()){
				String line = scan.nextLine();
				readIt.add(line);				
			}
					
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return readIt;
	}
	
	
}
