package creational.factorypattern;

public class LoggerMain {

	public static void main(String[] args) {

		AppLogger fileLogger=LoggerFactory.getInstance(LoggerType.FileLogger);
		AppLogger dbLogger=LoggerFactory.getInstance(LoggerType.DBLogger);
		AppLogger consoleLogger=LoggerFactory.getInstance(LoggerType.ConsoleLogger);
		
		fileLogger.log("ABC");
		dbLogger.log("XYZ");
		consoleLogger.log("MNO");
		
	}

}
