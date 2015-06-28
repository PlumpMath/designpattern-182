package behavioral.iterator;

public class RadioStation {

	public static void main(String[] args) {
		SongOf70s songOf70s=new SongOf70s();
		SongOf80s songOf80s=new SongOf80s();
		SongOf90s songOf90s=new SongOf90s();
		
		DiscJokey dj=new DiscJokey(songOf70s, songOf80s, songOf90s);
		dj.showSongs();
	}

}
