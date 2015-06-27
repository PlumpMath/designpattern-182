package behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SongOf80s implements SongIterator{
	
	SongInfo[] bestSongs;
	int arrayValue=0;
	
	public SongOf80s(){
		bestSongs = new SongInfo[3];
		addSong("A","B0",1234);
		addSong("B","C0",1164);
		addSong("C","D0",6789);
	}

	private void addSong(String songName,String bandName,int yearReleased) {
		SongInfo song=new SongInfo(songName, bandName, yearReleased);
		bestSongs[arrayValue]=song;
		arrayValue++;
	}
	
	public SongInfo[] getBestSongs(){
		return bestSongs;
	}

	@Override
	public Iterator createIterator() {
		return Arrays.asList(bestSongs).iterator();
	}
}