package structural.compositepattern.pdp;

public class File implements FileComponent{
	private String name;
	public File(String name){
		this.name=name;
	}

	@Override
	public void printName() {
		System.out.println("File Name : "+this.name);
	}
}
