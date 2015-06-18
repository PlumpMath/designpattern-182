package structural.adapterpattern;

//This uses Object Adapter for Adapting as per the requirement
public class ExpansionAdapter2 extends Plug implements Socket{

	//Uses the Plug object over here
	Plug plug;
	
	ExpansionAdapter2(Plug plug){
		this.plug=plug;
	}
	
	@Override
	public String getInput() {
		String input=plug.getInputXYZ();
		//we can modify the data over here//if we want to do some modification
		return input;
	}
}
