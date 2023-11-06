package abstractex.quiz;

public class Quiz1 {
	public static void main(String[] args) {
		Car sonata = new Sonata("Sonata");
		sonata.start();
		sonata.drive();
		sonata.stop();
		sonata.turnOff();
		
		Car avante = new Avante("Avante");
		avante.start();
		avante.drive();
		avante.stop();
		avante.turnOff();
	}
}

abstract class Car{
	String name;
	public Car(String name) {
		this.name = name;
	}
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	
}

class Avante extends Car{
	public Avante(String name) {
		super(name);
	}
	@Override
	public void start() {
		System.out.println(name+" 시동을 켭니다.");
		
	}

	@Override
	public void drive() {
		System.out.println(name+" 달립니다.");
		
	}

	@Override
	public void stop() {
		System.out.println(name+" 멈춥니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println(name+" 시동을 끕니다.");
		
	}
	
}

class Sonata extends Car{
	
	public Sonata(String name) {
		super(name);
	}
	
	@Override
	public void start() {
		System.out.println("Sonata 시동을 켭니다.");
		
	}

	@Override
	public void drive() {
		System.out.println("Sonata 달립니다..");
		
	}

	@Override
	public void stop() {
		System.out.println("Sonata 멈춥니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Sonata 시동을 끕니다.");
		
	}
	
}
