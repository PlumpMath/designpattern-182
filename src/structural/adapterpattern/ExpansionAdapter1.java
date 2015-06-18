package structural.adapterpattern;

//This uses Class Adapter for Adapting as per the requirement
public class ExpansionAdapter1 extends Plug implements Socket{

	@Override
	public String getInput() {
		String input=super.getInputXYZ();
		//we can modify the data over here//if we want to do some modification
		return input;
	}
}
