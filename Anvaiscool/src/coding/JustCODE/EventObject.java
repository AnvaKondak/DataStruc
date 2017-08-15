package coding.JustCODE;
import javax.swing.*; //needed for swing classes
import java.awt.event.*; //event listener interface 

/** This class will demonstrate how to retrieve the action command from 
 * an event object 
 * @author Anva
 *
 */

public class EventObject extends JFrame {
	
	private JButton button1; //components 
	private JButton button2; 
	private JButton button3; 
	
	private JPanel panel; //A panel to hold components 
	private final int WINDOW_WIDTH = 300;
	private final int WINDOW_HEIGHT = 300;
	
     /** 
      * Constructor
      */
	public EventObject() {
		//set title bar text 
		setTitle("Button Window"); 
		//set size of window m
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT); 
		//specify what happens when close button is clickked
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		//create 3 buttons 
		button1 = new JButton("Click me pussy"); 
		button2 = new JButton("Click me peasant inferior to my existence"); 
		button3 = new JButton("Click me I'll pay your bills");
		//register an event listener with all three buttons 
		button1.addActionListener(new ButtonListener());
		button2.addActionListener(new ButtonListener());
		button3.addActionListener(new ButtonListener());
	
		//create a panel and add buttons to it 
		panel = new JPanel(); 
		panel.add(button1); 
		panel.add(button2);
		panel.add(button3);
		//add panel to content pane
		add(panel); 
		//display window  
		setVisible(true); 			
	}
	
	/** Private inner class that handles event when 
	 * user clicks button.
	 */
	private class ButtonListener implements ActionListener { 
		public void actionPerformed(ActionEvent e) { 
			//get action command 
			String actionCommand = e.getActionCommand();
			
			//Determine which buttom was clicked and 
			//display a method 
			 if (actionCommand.equals("Click me pussy")) { 
					JOptionPane.showMessageDialog(null, "You clicked button 1. ");
				}
				else if (actionCommand.equals("Click me peasant inferior to my existence")) { 
					JOptionPane.showMessageDialog(null,"You clicked button 2. ");  }
				else if (actionCommand.equals("Click me I'll pay your bills")) { 
					JOptionPane.showMessageDialog(null, "You clicked button 3. ");
				}
			 /* 
			  * an alternative method to determine which button was clicked 
			  * would be the getSource method that returns a reference 
			  * to the component that is the source of the event. 
			  * replace ur method w if statements for each button as such: 
			  * if (e.getSource() == button1) { 
			       JOptionPane.showMessageDialog(null, "You clicked 1st button. "); 
			  */
				
		}
	}

	public static void main(String[] args) {
    new EventObject();

	}

}
