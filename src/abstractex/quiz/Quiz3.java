package abstractex.quiz;

public class Quiz3 {
	public static void main(String[] args) {
		Human human = new Human();
		human.sleep();
		human.move();
		human.readBook();
		
		Tiger tiger = new Tiger();
		tiger.sleep();
		tiger.move();
		tiger.hunting();
	}
}

abstract class Animal{
	abstract void move();
	void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}
}

class Human extends Animal{

	@Override
	void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal{

	@Override
	void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}
