package creational.factorypattern;

public class FileLogger implements AppLogger{

	@Override
	public void log(String logMsg) {
		System.out.println("Writing to File abc.txt"+logMsg);
	}
}
