package behavioral.memento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DialogObject extends JFrame{
	
	private JButton saveButton,undoButton,redoButton;
	private JTextArea article= new JTextArea(15,35);
	
	CareTaker caretaker = new CareTaker();
	Originator originator = new Originator();
	
	int savedMemento=0;
	int currentMemento=0;
	
	public DialogObject(){
		this.setSize(500,320);
		this.setTitle("Memento Design Pattern");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.add(new JLabel("Article 1"));
		panel1.add(article);
		
		ButtonListener saveListener = new ButtonListener();
		ButtonListener undoListener = new ButtonListener();
		ButtonListener redoListener = new ButtonListener();
		
		saveButton = new JButton("Save");
		saveButton.addActionListener(saveListener);
		
		redoButton = new JButton("Redo");
		redoButton.addActionListener(redoListener);
		
		undoButton = new JButton("Undo");
		undoButton.addActionListener(undoListener);
		
		panel1.add(saveButton);
		panel1.add(redoButton);
		panel1.add(undoButton);
		
		this.add(panel1);
		this.setVisible(true);
	}
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == saveButton){
				String textInTextArea = article.getText();
				//we are saving whatever is on text area to field inside a memento
				//Setting the memento as the new text
				//And adding the memento to ArrayList by returning the object
				originator.set(textInTextArea);
				caretaker.addMemento(originator.storeInMemento());
				savedMemento++;
				currentMemento++;
				System.out.println("Save files " + savedMemento);
				undoButton.setEnabled(true);
			}else if(e.getSource() == undoButton){
				if(currentMemento>=1){
					currentMemento--;
					//Getting the memento from current index -- ie previous memento
					String textBoxString = originator.restoreFromMemento(caretaker.getMemento(currentMemento));
					//and displaying it on screen
					article.setText(textBoxString);
					redoButton.setEnabled(true);
				}else{
					undoButton.setEnabled(false);
				}
			}else  if(e.getSource() == redoButton){
				if((savedMemento-1)>currentMemento){
					//getting the next memento from list
					currentMemento++;
					//getting the data from the stored memento
					//over here one -- so we are returning it directly
					//other wise we can get 
					String textBoxString = originator.restoreFromMemento(caretaker.getMemento(currentMemento));
					article.setText(textBoxString);
					undoButton.setEnabled(true);
				}else{
					redoButton.setEnabled(false);
				}
			}
		}
		
	}
}
