package Abstract2;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void start() {
		System.out.println("차량의 시동을 켭니다.");
	}
	
	public void turnOffCar() {
		System.out.println("차량의 시동을 끕니다.");
	}
	
	// 템플릿 패턴 ( 행위 )
	// 템플릿 메소드 만들기
	public void run() {
		start();
		drive();
		stop();
		turnOffCar();
	}
}
