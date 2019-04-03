package Com.Class16;

public class Computer {
	
	boolean mouse, keyboard;
	
	String os, brand;
	
	int screen, ram;
	
	public static void main (String [] args) {
		// 1 Object
		Computer comp1 = new Computer();
		
		comp1.mouse = true;
		comp1.keyboard = true;
		comp1.screen = 2;
		comp1.ram = 8;
		comp1.os = "Windows";
		comp1.brand = "HP";
		
		comp1.watchMovie();
		comp1.doJavaCoding();
		comp1.playMusic();
		System.out.println("------Second Object-------");
		// 2 Object
		
Computer comp2 = new Computer();
		
		comp2.mouse = false;
		comp2.keyboard = false;
		comp2.screen = 4;
		comp2.ram = 6;
		comp2.os = "Mac OS";
		comp2.brand = "Apple";
		
		
		comp2.watchMovie();
		comp2.doJavaCoding();
		comp2.playMusic();
	}
	
	void watchMovie() {
		System.out.println("We can watch movie on a " +brand+ " computer");
	}
	void doJavaCoding() {
		System.out.println("We can do Java Coding on our " +brand+" computer");
	}
void playMusic() {
	System.out.println("We can play music on our "+brand+ " computer");
}
}
