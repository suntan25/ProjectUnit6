import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class FrontEnd {
	JFrame frame;
	JPanel panel;
	JTextField textfield;
	public FrontEnd()
	{
		
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField textfield = new JTextField(15);
		JTextArea textarea = new JTextArea(3,15);
		JLabel label = new JLabel("Enter a valid Username");
		JLabel label2 = new JLabel("What is your account slogan?");
		JButton button = new JButton("Submit");
		JButton button2 = new JButton("Submit");
		frame.setTitle("Project Unit 6");
		frame.setVisible(true);
		frame.setSize(300,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(550,200);
		panel.add(label);
		panel.add(textfield).setSize(100, 100);;
		panel.add(button);
		panel.add(label2);
		panel.add(textarea);
		panel.add(button2);
		frame.add(panel);
		
		
		
		
		
		
		
	}
	
	
	
	

}
