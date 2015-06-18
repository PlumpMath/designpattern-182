package creational.singleton;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {

	@Override
	public void run() {
		
		Singleton newInstance=Singleton.getInstance();
		System.out.println("Instance ID :"+System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		LinkedList<String> player1Tiles=newInstance.getTitles(7);
		System.out.println("Player Tiles :"+player1Tiles);
	}
	

}
