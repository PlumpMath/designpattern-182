package creational.singleton;

import java.util.LinkedList;

public class ScrabbleTest {

	public static void main(String args[]){
		Singleton newInstance=Singleton.getInstance();
		//To get the unique ID
		System.out.println("Instance ID 1 :"+System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		LinkedList<String> player1Tiles=newInstance.getTitles(7);
		System.out.println("Player 1 Tiles :"+player1Tiles);
		
		//Even Though we had forced sleep still its giving the same ID for Instance 2 
		Singleton newInstance2=Singleton.getInstance();
		System.out.println("Instance ID 2 :"+System.identityHashCode(newInstance2));
		System.out.println(newInstance2.getLetterList());
		LinkedList<String> player2Tiles=newInstance2.getTitles(7);
		System.out.println("Player 2 Tiles :"+player2Tiles);
	}
}
