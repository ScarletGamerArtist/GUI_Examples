package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
 * Alanna Botscharow
 * 12/18
 */
public class SimpleWindow implements ActionListener{
	JButton button1 = null; //this variable is a member of the class.
	JButton button2 = null;
	//AWT = abstract window toolkit
	
	
	public static void main(String[] args) {
		 
		new SimpleWindow(); 
		
	}


		public SimpleWindow() {
			 
			JFrame frame = new JFrame(); 
			FlowLayout layout = new FlowLayout();
			//layout
			frame.setLayout(layout);
			
			
			//A simple window		
			frame.setTitle("simple window");
			frame.setSize(400,200);
			frame.setLocation(200, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			//label object
			JLabel label = new JLabel("This is my label!");
			frame.add(label);
			
			//button object
		    button1= new JButton("click me"); 
		    button2 = new JButton("don't click me"); 
			button1.addActionListener(this); //button listener
			button2.addActionListener(this);
			frame.add(button1); 
			
			
			//JFrame pack (Sizes down window)
			frame.pack(); 
			frame.setVisible(true);

		}
		public void actionPerformed(ActionEvent event) {
			Object control = event.getSource();
			if (control == button1) //If button1 was clicked
			{
				JOptionPane.showMessageDialog(null, "I like red!");
			}
			else if (control == button2) //else if button 2 was clicked
			{
				JOptionPane.showMessageDialog(null, "I like Blue!");
			}
			
			
			
			
		}

}

