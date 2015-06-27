package reflection;

public class ClassB extends ClassA{

	public ClassB(int numberA,String stringA){
		System.out.println("Class B Object is created with parameter as "+ numberA + " and String "+ stringA);
	}
	
	public ClassB(ClassA a){
		System.out.println(a.getSomeData());
	}
	
	private String idCode="100";
	
	private String getPrivate(){
		return "How did you get this?";
	}
	
	public void setPrivate(String idCode){
		this.idCode=idCode;
	}
	
	private String getOtherPrivate(int numberA,String stringA){
		return "How did you get number" + numberA + "" + stringA;
	}
	
	public String getPublic(){
		return "Public method";
	}
	
}
