package abstractex.quiz;

public class Quiz2 {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		bus.rufuel();
		bus.takePassenger();
		
		AutoCar autoCar = new AutoCar();
		autoCar.run();
		autoCar.rufuel();
		autoCar.load();
		
	}
}

abstract class Car1{
	public abstract void run();
	public abstract void rufuel();
	
}

class Bus extends Car1{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void rufuel() {
		System.out.println("천연가스를 충전 합니다.");
	}
	
	void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}
	
}

class AutoCar extends Car1{

	@Override
	public void run() {
		System.out.println("자동차가 달립니다.");
	}

	@Override
	public void rufuel() {
		System.out.println("휘발유를 주유합니다.");
	}
	void load() {
		System.out.println("짐을 싣습니다.");
	}
	
	
}
