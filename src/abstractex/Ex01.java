package abstractex;

public class Ex01 {
	public static void main(String[] args) {
		//Computer com1 = new Computer();//컴퓨터는 추상 클래스이기에 인스턴스 생성 불가능.
		Computer com1 = new DeskTop();
		Computer com2 = new NoteBook();
		com1.turnOn();
		com1.turnOff();
		com1.display();
		com1.typing();
		
		com2.turnOn();
		com2.turnOff();
		com2.display();
		com2.typing();
	}
}

abstract class Computer{//추상클래스 선언
	//공통기능은 일반메소드로 선언
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//추상메소드 선언
	public abstract void display();
	
	public abstract void typing();
}

class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop Display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");
	}//컴퓨터클래스 상속받기, 구현되지 않은 메소드가 
	
}


class NoteBook extends Computer{

	@Override
	public void display() {
		System.out.println("NoteBook DisPlay");
	}

	@Override
	public void typing() {
		System.out.println("NoteBook Typing");
		
	}
	
}













