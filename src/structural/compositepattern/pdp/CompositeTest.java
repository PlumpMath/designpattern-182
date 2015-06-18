package structural.compositepattern.pdp;

public class CompositeTest {
	public static void main(String args[]){
		
		Directory one=new Directory("test123");
		Directory two=new Directory("test456");
		Directory three=new Directory("test789");
		
		File a=new File("a.txt"),
				b=new File("b.txt"),
				c=new File("c.txt"),
				d=new File("d.txt"),
				e=new File("e.txt"),
				f=new File("f.txt");
		
		one.add(b);
		one.add(two);
		two.add(c);
		two.add(d);
		two.add(three);
		three.add(e);
		three.add(f);
		
		//Printing name of Files in directory
		one.printName();
	}
}
