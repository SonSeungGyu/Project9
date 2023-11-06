package abstractex;

public class Ex02 {
	public static void main(String[] args) {
		Animal cat = new Cat();//부모로 형변환
		cat.sound();//재정의된 메소드가 호출됨

		Animal dog = new Dog();
		dog.sound();
		
	}
}

abstract class Animal{
	String kind;
	
	public void breathe() {//공통의 기능 일반메소드로 선언
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();//추상메소드 선언
}

class Cat extends Animal{
	public Cat() {
		kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
}

class Dog extends Animal{
	
	public Dog() {
		kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

