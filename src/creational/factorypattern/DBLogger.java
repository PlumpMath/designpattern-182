package creational.factorypattern;

public class DBLogger implements AppLogger{

	@Override
	public void log(String logMsg) {
		System.out.println("Writing into DataBase:"+logMsg);
	}
}
