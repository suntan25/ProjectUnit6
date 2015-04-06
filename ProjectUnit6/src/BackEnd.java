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
 		for(int i = 0; i < total.size(); i++)
		{
			if (total.get(i).equals(username))
			{
				message.add(total.get(i+1));
			}
		}
		return message;
	}
	public void addMessage(String username, String msg)
	{
		           
	}
	public List<String> getUsers()
	{
		List<String> total = e.read();
		List<String> usernames = new ArrayList<String>();
 		for(int i = 0; i < total.size(); i= i+2)
 		{
 			usernames.add(total.get(i));
		}
		return usernames;
	}
	

}
