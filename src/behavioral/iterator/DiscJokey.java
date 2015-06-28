package behavioral.iterator;

import java.util.Iterator;

public class DiscJokey {
	
	SongIterator songOf70s;
	SongIterator songOf80s;
	SongIterator songOf90s;
	
	public DiscJokey(SongIterator songOf70s,SongIterator songOf80s,SongIterator songOf90s){
		this.songOf70s=songOf70s;
		this.songOf80s=songOf80s;
		this.songOf90s=songOf90s;
	}
	
	public void showSongs(){
		Iterator<SongInfo> song70s = songOf70s.createIterator();
		Iterator<SongInfo> song80s = songOf80s.createIterator();
		Iterator<SongInfo> song90s = songOf90s.createIterator();
		
		System.out.println("Song of 70s");
		printSongs(song70s);
		
		System.out.println("Song of 80s");
		printSongs(song80s);
		
		System.out.println("Song of 90s");
		printSongs(song90s);
	}
	
	public void printSongs(Iterator<SongInfo> iter) {
		while(iter.hasNext()){
			SongInfo song=(SongInfo) iter.next();
			System.out.println("Song Name :"+song.getSongName());
			System.out.println("Song Band Name :"+song.getBandName());
			System.out.println("Song Year Released :"+song.getYearReleased());
		}
	}
}
