package sound;

import java.net.MalformedURLException;
import java.net.URL;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class PlaySound {

	public PlaySound() {
		String songName = "01.mp3";
		String pathToMp3 = System.getProperty("user.dir") +"/resources/"+ songName;
		BasicPlayer player = new BasicPlayer();
		try {
		    player.open(new URL("file:///" + pathToMp3));
		    player.play();
		} catch (BasicPlayerException | MalformedURLException e) {
		    e.printStackTrace();
		}
	}

}
