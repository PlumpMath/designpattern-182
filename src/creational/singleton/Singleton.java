package creational.singleton;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {
	
	private static Singleton firstInstance;
	
	String[] scrabbleLetters={
							"a","a","a","a",
							"b","b","b","b",
							"c","c","c","c",
							"d","d","d","d",
							"e","e","e","e",
							"f","f","f","f",
							"g","g","g","g",
							"h","h","h","h",
							"i","i","i","i"
							};
	private LinkedList<String> letterList=new LinkedList<String>(Arrays.asList(scrabbleLetters));
	
	//firstThread is created - to make it thread failure and pause the thread
	static boolean firstThread=true;
	
	private Singleton(){
	}
	
//NOTE: Not Thread Safe as it gives different ID for Each Instance and the letter list also is different
//	public static Singleton getInstance(){
//		if(firstInstance==null){
//			if(firstThread){
//				firstThread=false;
//				Thread.currentThread();
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			firstInstance=new Singleton();
//			Collections.shuffle(firstInstance.letterList);
//		}
//		return firstInstance;
//	}
	
// Syncchronized is an Heavy Operation/Expensive - but we want synchronization at creation of instance only
//	public synchronized static Singleton getInstance(){
//		if(firstInstance==null){
//			if(firstThread){
//				firstThread=false;
//				Thread.currentThread();
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			firstInstance=new Singleton();
//			Collections.shuffle(firstInstance.letterList);
//		}
//		return firstInstance;
//	}
	
	//Still the code is not Thread Safe - as there can be scenarion when the class is getting synchronised
	//and it is preempted at the time // so new instance will be created over here
//	public static Singleton getInstance(){
//		if(firstInstance==null){
//			//Code for deliberately making Thread work
//			if(firstThread){
//				firstThread=false;
//				Thread.currentThread();
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			
//			synchronized(Singleton.class){
//				firstInstance=new Singleton();
//				Collections.shuffle(firstInstance.letterList);
//			}
//		}
//		return firstInstance;
//	}
	
	public static Singleton getInstance(){
		if(firstInstance==null){
			//Code for deliberately making Thread work
			if(firstThread){
				firstThread=false;
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			synchronized(Singleton.class){
				if(firstInstance==null){
				firstInstance=new Singleton();
				Collections.shuffle(firstInstance.letterList);
				}
			}
		}
		return firstInstance;
	}
	
	public LinkedList<String> getLetterList(){
		return firstInstance.letterList;
	}
	
	public LinkedList<String> getTitles(int tiles){
		LinkedList<String> tilesToSend=new LinkedList<String>();
		for(int i=0;i<tiles;i++){
			tilesToSend.add(firstInstance.letterList.remove(0));
		}
		return tilesToSend;
	}
	
}
