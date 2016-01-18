package mp3;

import java.util.ArrayList;

public class mp3 {
	
	private String artist;
	private String title;
	private int length;
	//need length in this assignment
	
	public mp3(String a, String t, int l) {
		artist = a;
		title = t;
		length = l;
	}
	
	public void play() {
		System.out.println("now playing " + title + " by " + artist + " length: " + length);
	}
	
	public int length() {
		return length;
	}

	public static void main(String[] args) {
		
		ArrayList<mp3> playlist = new ArrayList<mp3>();
		playlist.add(new mp3("Maroon 5", "Maps", 200));
		playlist.add(new mp3("Michael Jackson", "Smooth Criminal", 300));
		playlist.add(new mp3("Lil John", "Get Low", 150));
		playlist.add(new mp3("Akon", "Dangerous", 90));
		playlist.add(new mp3("Ace Hood", "Top of the World", 350));
		
//temp: array
//		for(mp3 song: playlist) {
//			song.play();
//		}
		
		for(int i = 0; i < playlist.size(); i++) {
			playlist.get(i).play();
		} System.out.println("");
		
//print summ of all the long lengths
		int sum = 0;
		for(int i = 0; i < playlist.size(); i++) {
			int length = playlist.get(i).length();
			sum += length;
			//System.out.println(playlist.get(i).length());
		} System.out.println("The total time is: " + sum);
		
//longest and shrotest song
		mp3 longest = playlist.get(0);
		mp3 shortest = playlist.get(0);
		
		for(int i = 0; i < playlist.size(); i++) {
			if (longest.length() < playlist.get(i).length()) longest = playlist.get(i);
			if (shortest.length() > playlist.get(i).length()) shortest = playlist.get(i);
		} 
		
		System.out.println("The longest song: ");
		longest.play();
		System.out.println("The shortest song: ");
		shortest.play();

	}

}
