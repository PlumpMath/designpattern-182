package behavioral.iterator;

public class SongInfo {
	
	String songName;
	String bandName;
	int yearReleased;
	
	public SongInfo(String songName,String bandName,int yearReleased){
		this.songName = songName;
		this.bandName = bandName;
		this.yearReleased = yearReleased;
	}
	
	public String getSongName(){
		return this.songName;
	}
	
	public String getBandName(){
		return this.bandName;
	}
	
	public int getYearReleased(){
		return this.yearReleased;
	}
}
