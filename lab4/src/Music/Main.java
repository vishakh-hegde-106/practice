package Music;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	
		// MENU
		System.out.println("What you want to Play...");
		System.out.println("1. Music");
		System.out.println("2. Video");
		System.out.println("3. AVI File");
			
		System.out.println("Enter your Choice : ");
		int choice = scanner.nextInt();
		System.out.println("Enter File Name : ");
		String file = scanner.next();
		switch (choice) {
		case 1: {
			MusicPlayer musicPlayer = new MusicPlayer();
			musicPlayer.play(file);
			break;
		}
		case 2: {
			MusicPlayerAdapter adapter = new MusicPlayerAdapter(new Mp4Player());
			adapter.play(file);
			break;
		}
		case 3: {
			MusicPlayerAdapter adapter = new MusicPlayerAdapter(new VlcPlayer());
			adapter.play(file);
			break;
		}
		default:
			System.out.println("Wrong Choice");
		}
	}

}
