package structural.adapterpattern;

public class AdapterTest {

	public static void main(String[] args) {
		//Using class Adapter
		Socket socket=new ExpansionAdapter1();
		System.out.println(socket.getInput());

		//Using object Adapter
		Plug plug=new Plug();
		Socket socket2=new ExpansionAdapter2(plug);
		System.out.println(socket.getInput());
	}

}
