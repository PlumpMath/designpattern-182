package behavioral.memento;

public class Originator {
	//Originator: Sets and Gets values from the currently targeted Memento.
	//Creates new Mementos and assigns current values to them.
	private String article;
	
	//for saving
	public void set(String article){
		System.out.println("Originator : Current version of article : " + article);
		this.article=article;
	}
	
	//for saving
	public Memento storeInMemento(){
		System.out.println("Originator : Saving to Memento");
		//Creating new Memento object over here
		return new Memento(this.article);
	}
	
	//for redo and undo operation
	public String restoreFromMemento(Memento memento){
		//Getting the article from Memento object passed from it
		this.article = memento.getArticle();
		System.out.println("Originator : Previous article saved in memento");
		return this.article;
	}
}
