import java.util.ArrayList;
import java.util.List;


public class BackEnd 
{
	private Encoder e;
	
	public BackEnd(String filename)
	{
		e = new Encoder(filename);
	}
	
	public List<String> getMessages(String username)
	{
		List<String> total = e.read();
		List<String> message = new ArrayList<String>();
		
		return null;
	}
	public void addMessage(String username, String msg)
	{
		
	}
	public List<String> getUsers()
	{
		return null;
	}
	

}
