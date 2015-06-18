package creational.singleton;

public class ScrabbleTestThreads {
	
	public static void main(String args[]){
		Runnable getTitles=new GetTheTiles();
		
		Runnable getTitlesAgain=new GetTheTiles();
		
		new Thread(getTitles).start();
		new Thread(getTitlesAgain).start();
	}

}
