package behavioral.memento;

public class Memento {
	//Memento: The basic object that is stored in different states. 
	private String article;
	public Memento(String article) {
		this.article=article;
	}

	public String getArticle(){
		return this.article;
	}
}
