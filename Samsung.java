package week3.Day3;

public class Samsung extends AndroidTv{

	public static void main(String[] args) {
		
		Samsung s1 = new Samsung();
		s1.OpenApp();
		s1.PlayVideo();
		s1.music();

	}

	@Override
	public void PlayVideo() {
		System.out.println("Video");
		
	}

	@Override
	public void music() {
		System.out.println("Music ");
		
	}

}
