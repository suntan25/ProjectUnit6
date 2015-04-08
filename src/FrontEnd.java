import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class FrontEnd extends JFrame{
	
	JFrame frame;
	JPanel panel;
	JTextField textfield;
	JTextArea textarea;
	String message = "";
	
	private BackEnd myBackend;
	
	public FrontEnd() throws FileNotFoundException
	{
		myBackend = new BackEnd("infopasser.txt");
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField textfield = new JTextField(15);
		JTextArea textarea = new JTextArea(3,15);
		JLabel label = new JLabel("Enter a valid Username, hit enter when finished");
		JLabel label2 = new JLabel("Input a message, hit enter when finished");
		JButton button2 = new JButton("Submit");
		textarea.setLineWrap(true);
		frame.setResizable(false);
		frame.setTitle("Project Unit 6");
		frame.setVisible(true);
		frame.setSize(300,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(550,200);
		panel.add(label);
		panel.add(textfield).setSize(100, 100);;
		panel.add(label2);
		panel.add(textarea);
		panel.add(button2);
		frame.add(panel);
		button2.addActionListener(new ActionListener(){;
		public void actionPerformed (ActionEvent e)
		{
			button2.setBackground(Color.GREEN);
			String user = textfield.getText();
			String msg = textarea.getText();
			if (user.length() > 0 && msg.length() > 0)
			{
				myBackend.addMessage(user, msg);
			}
			else
			{
				// show a JOptionPane w/ an error message (i.e., missing username and/or message)
				
			}
		}
		});
		textarea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
 //               System.out.println(textarea.getText());
            }
        });
		textfield.addKeyListener(new java.awt.event.KeyAdapter(){
			public void keyTyped(java.awt.event.KeyEvent evt){
	//			System.out.println(textfield.getText());
			}
		});
		
	}
	
		
	
	
	

}
