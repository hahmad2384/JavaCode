package Com.Class16;

public class Phone {

	int memory;
	String cam, brand;
	
	public static void main(String[] args) {
		
		Phone iphone = new Phone();
		iphone.memory = 16;
		iphone.cam = "HD";
		iphone.brand = "Apple";
		
		iphone.playMusic();
		iphone.playGames();
		iphone.takepictures();
		System.out.println();
		
		Phone Android = new Phone();
		Android.memory = 8;
		Android.cam = "HD";
		Android.brand = "Samsung";
		
		Android.playMusic();
		Android.playGames();
		Android.takepictures();
		System.out.println();
		
		Phone Nokia = new Phone();
		Nokia.memory = 16;
		Nokia.cam = "HD";
		Nokia.brand = "Nokia";
		
		Nokia.playMusic();
		Nokia.playGames();
		Nokia.takepictures();
		System.out.println();
		
		
		
	}
	
	void playMusic() {
	System.out.println("We can play music on "+brand+" phone");
	}
	
	void playGames() {
		System.out.println("We can play games on "+brand+" phone");
	}
	void takepictures() {
		System.out.println("We can take Hight Quality pictures on "+brand+" phone");
	}
	
	
	
	
}
