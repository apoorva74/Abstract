package OOPmentoring;

public class TestLaptop {

	public static void main (String[] args) {
		
		computer compvar = new Hp();
		compvar.poweron();
		compvar.shutdown();
		
		Hp spectrevar = new Hp();
		spectrevar.brandName();
		spectrevar.keyboard();
		spectrevar.mouse();
		spectrevar.builtInSpeaker();
		spectrevar.touchscreen();
		
		
		components comVar = new Hp();
		comVar.keyboard();
		comVar.mouse();
		comVar.speakers();
		
		computer maclaptop = new Mac();
		maclaptop.poweron();
		maclaptop.shutdown();
	}
	
	
}
