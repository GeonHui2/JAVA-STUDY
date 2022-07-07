package ch09;

public abstract class Computer {

	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}

package ch09;

public class Desktop extends Computer{

	@Override
	public void display() {

		System.out.println("DeskTop display");
	}

	@Override
	public void typing() {

		System.out.println("DeskTop typing");
	}

	@Override
	public void turnOff() {
		System.out.println("Destop turnoff");
		
	}
	
	

}

package ch09;

public abstract class NoteBook extends Computer{

	@Override
	public void typing() {
		System.out.println("NoteBook display");
	}

}

package ch09;

public class MyNoteBook extends NoteBook{

	@Override
	public void display() {
		System.out.println("MyNoteBook display");		
	}

}

package ch09;

public class ComputerTest {

	public static void main(String[] args) {

		Computer computer = new Desktop();
		computer.display();
		computer.turnOff();
		
		NoteBook myNote = new MyNoteBook();
	}

}
