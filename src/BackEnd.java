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
		List<String> messages = new ArrayList<String>();
 		for(int i = 0; i < total.size(); i++)
		{
			String[] words = total.get(i).split(" ");
 			if (words[0].equals(username))
			{
				messages.add(words[1]);
			}
		}
		return messages;
	}
	public void addMessage(String username, String msg)
	{
		   e.write(username, msg);        
	}
	public List<String> getUsers()
	{
		List<String> total = e.read();
		List<String> usernames = new ArrayList<String>();
		List<String> users = new ArrayList<String>();
 		for(int i = 0; i < total.size(); i= i++)
 		{
 			String[] words = total.get(i).split(" ");
 			usernames.add(words[0]);
		}
 		for (int i = 0; i<usernames.size(); i++)
 		{
 			if (users.contains(usernames.get(i)) == false)
 			{
 				users.add(usernames.get(i));
 			}
 		}
		return users;
	}
	

}
