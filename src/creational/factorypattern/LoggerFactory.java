package creational.factorypattern;

public class LoggerFactory {

	public static AppLogger getInstance(LoggerType loggerType){
		AppLogger logger=null;
		if(loggerType==LoggerType.FileLogger)
			logger=new FileLogger();
		else if(loggerType==LoggerType.DBLogger)
			logger=new DBLogger();
		else if(loggerType==LoggerType.ConsoleLogger)
			logger=new ConsoleLogger();

		return logger;
	}
}
