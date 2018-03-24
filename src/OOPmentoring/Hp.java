package OOPmentoring;

public class Hp extends Laptop implements computer, components {

	//computer interface
	
	public void poweron() {
		System.out.println("your computer has powered on");
	}
	
	public void shutdown() {
		System.out.println("Your computer has shut down");
	}
	
	//components interface
	
	public void speakers() {
		System.out.println("you have speakers");
	}

	public void keyboard() {
		System.out.println("you have keyboard");
	}
	
	//laptop abstract class
	
	public void touchscreen() {
		System.out.println("you have touchscreen");
	}

	public void buitinspeaker() {
		System.out.println("you have Buit-in speaker");
	}
	
	//HP class
	
	public void brandName() {
		System.out.println("Brand name is HP");
	}
	
	//unimplemented method
	
	public void mouse() {
		
	}
	
	
}
