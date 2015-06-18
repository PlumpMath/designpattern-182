package structural.compositepattern.pdp;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponent{

	public String directoryName;
	private List<FileComponent> files=new ArrayList<FileComponent>();
	
	public Directory(String directoryName) {
		this.directoryName=directoryName;
	}
	
	@Override
	public void printName() {
		System.out.println("Directory Name :"+directoryName);
		
		for (int i = 0; i < files.size(); i++) {
			FileComponent obj=files.get(i);
			System.out.println(i);
			obj.printName();
		}
	}
	
	public void add(FileComponent obj){
		files.add(obj);
	}
}
