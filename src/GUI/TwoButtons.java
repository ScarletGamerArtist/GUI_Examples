package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
 * Alanna Botscharow
 * 12/18
 */
public class TwoButtons implements ActionListener{
	JButton redButton = null; //this variable is a member of the class.
	JButton greenButton = null;
	JFrame myFrame = null;
	public static void main(String[] args) {
	
		//Instance of the two buttons
		new TwoButtons(); 
		
	}

	//constructor public 
	public TwoButtons() {
        myFrame = new JFrame(); //Create a new JFrame
		
		//set frame title, size, location.
		myFrame.setTitle("Choose your color");
		myFrame.setSize(550,150); 
		myFrame.setLocation(200, 300);
		
		
		//close the program.
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//assign layout
		FlowLayout myLayout = new FlowLayout(); 
		myFrame.setLayout(myLayout);
		
		
		//Buttons
		redButton = new JButton("red");
		greenButton = new JButton("green"); 
		
		myFrame.add(redButton);
		myFrame.add(greenButton); 
		
		// link the buttons
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		
		//make the frame visible
		myFrame.setVisible(true);
		
		
	}

	public void actionPerformed(ActionEvent event) {
		Object control = event.getSource(); 
		
		//if red button was clicked
		if (control == redButton )
		{
			myFrame.getContentPane().setBackground(Color.red) ;
		}
		//else if green button was clicked
		else if (control == greenButton)
		{
			myFrame.getContentPane().setBackground(Color.green) ;
		}
	}
}
