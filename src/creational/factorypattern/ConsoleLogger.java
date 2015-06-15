package creational.factorypattern;

public class ConsoleLogger implements AppLogger{

	@Override
	public void log(String logMsg) {
		System.out.println("Writing on console"+logMsg);
	}
}
