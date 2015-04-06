
import java.io.FileNotFoundException;
import java.io.FileReader;
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
		List<String> readFile = new ArrayList<String>();
		 while((line = fileReader.getEncoding()) != null) {
             readFile = line;
         }    
	}
	
	
}
