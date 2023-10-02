package Music;

public class VlcPlayer implements AdvancedMediaPlayer{
	@Override
	public void playFormat(String fileName) {
		System.out.println("Playing VLC Music "+fileName);
	}
}
