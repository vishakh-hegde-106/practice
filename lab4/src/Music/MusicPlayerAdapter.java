package Music;

public class MusicPlayerAdapter implements MediaPlayer{
	private AdvancedMediaPlayer a;
	MusicPlayerAdapter(AdvancedMediaPlayer adv){
		this.a = adv;
	}
	@Override
	public void play(String fileName) {
		this.a.playFormat(fileName);
	}
}
