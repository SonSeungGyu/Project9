package abstractex.quiz;

import java.util.ArrayList;

public class Quiz4 {
	public static void main(String[] args) {
		ArrayList<Car2> list = new ArrayList<Car2>();
		
		list.add(new Bus1());
		list.add(new AutoCar1());
		
		AutoCar1 car1 = (AutoCar1)list.get(1);
		
		list.get(0).run();
		list.get(0).rufuel();
		Bus1 car = (Bus1)list.get(0);
		car.takePassenger();
		
		
		list.get(1).run();
		list.get(1).rufuel();
		car1.load();
		
		System.out.println("==========================================");
		for (int i = 0; i < list.size(); i++) {
			Car2 car3 = list.get(i);
			
			car3.run();
			car3.rufuel();
			
			if(car3 instanceof Bus1) {// 부모 타입의 객체라 자식의 기능을 사용하기 위해선 다운캐스팅을 해주어야 함.
				Bus1 bus = (Bus1) car3;
				bus.takePassenger();
			}else if(car3 instanceof AutoCar1) {
				AutoCar1 auto = (AutoCar1) car3;
				auto.load();
			}
			
		}
	}
}

abstract class Car2{
	public abstract void run();
	public abstract void rufuel();
	
}

class Bus1 extends Car2{

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

class AutoCar1 extends Car2{

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
