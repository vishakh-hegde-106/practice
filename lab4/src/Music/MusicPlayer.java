package Music;

public class MusicPlayer implements MediaPlayer{
	@Override
	public void play(String fileName) {
		System.out.println("Playing Music "+fileName);
	}
}
