package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SongOf70s implements SongIterator{
	
	ArrayList<SongInfo> bestSongs;
	
	public SongOf70s(){
		bestSongs = new ArrayList<SongInfo>();
		addSong("A","B0",1234);
		addSong("B","C0",1164);
		addSong("C","D0",6789);
	}

	private void addSong(String songName,String bandName,int yearReleased) {
		SongInfo song=new SongInfo(songName, bandName, yearReleased);
		bestSongs.add(song);
	}

	@Override
	public Iterator<SongInfo> createIterator() {
		return bestSongs.iterator();
	}
}
