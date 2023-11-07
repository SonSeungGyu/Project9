package finalex;

public class Ex03 {

}

class Parents{
	final void method1() {
		
	}
	void method2() {
		
	}
}

class Child extends Parents{
	//final void method1() {//에러
		
	//}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		super.method2();
	}
	
}