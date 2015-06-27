package behavioral.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class SongOf90s implements SongIterator{
	
	Hashtable<Integer,SongInfo> bestSongs;
	int counter=0;
	public SongOf90s(){
		bestSongs = new Hashtable<Integer,SongInfo>();
		addSong("A","B0",1234);
		addSong("B","C0",1164);
		addSong("C","D0",6789);
	}

	private void addSong(String songName,String bandName,int yearReleased) {
		SongInfo song=new SongInfo(songName, bandName, yearReleased);
		bestSongs.put(counter++, song);
	}
	
	public Hashtable<Integer, SongInfo> getBestSongs(){
		return bestSongs;
	}

	@Override
	public Iterator createIterator() {
		return bestSongs.values().iterator();
	}
}
