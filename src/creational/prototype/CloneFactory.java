package creational.prototype;

public class CloneFactory {
	
	public Animal getClone(Animal animalToBeCloned){
		return animalToBeCloned.makeCopy();
	}

}
