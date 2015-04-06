
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Encoder {
	
	String line = null;
	FileReader fileReader;
	
	public Encoder(String filename)
	{
		try {
			fileReader =  new FileReader(filename);
		} catch (FileNotFoundException e) {
			 System.out.println("Unable to open file '" + filename + "'"); 
		}
	}
	
	public void write(String plaintext)
	{
		
	}
	
	public List<String> read()
	{	
		List<String> readIt= new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(fileReader)) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       readIt.add(line);
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return readIt;
	}
	
	
}
