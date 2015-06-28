package behavioral.memento;

import java.util.ArrayList;

public class CareTaker {

	//Caretaker: Holds an ArrayList that contains all previous versions of the Memento.
	//It can store and retrieve stored Mementos
	
	ArrayList<Memento> savedArticles = new ArrayList<Memento>();
	
	public void addMemento(Memento memento){
		savedArticles.add(memento);
	}
	
	public Memento getMemento(int index){
		return savedArticles.get(index);
	}
	
	
}
