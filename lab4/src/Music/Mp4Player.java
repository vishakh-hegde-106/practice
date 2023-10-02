package Music;

public class Mp4Player implements AdvancedMediaPlayer{
	@Override
	public void playFormat(String fileName) {
		System.out.println("Playing Video Music "+fileName);
	}
}
