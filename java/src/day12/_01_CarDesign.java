package day12;

class CarDesign{
	String brand;
	int speed;

	
	CarDesign(){
		this("현대", 100);
	}
	
	CarDesign(String brand, int speed){
		this.brand = brand;
		this.speed = speed;
		
	}
	
	void run() {
		System.out.printf("brand : %s / speed : %dkm/h\n", brand, speed);
		System.out.println();
	}
}
class SportCar extends CarDesign{
		
	SportCar(String brand, int speed){
		super(brand, speed); // super(brand, speed) : 부모 클래스의 생성자를 호출
		
	}
	
	@Override
	/*
	 * 오버라이딩이 중요한 이유!
	 * 1. 부모 클래스의 기능을 유지하면서, 자식클래스만의 동작을 추가할 수 있음
	 * 2. 부모 클래스로 여러 자식 클래스를 다룰 때 각각의 run()이 다르게 실행됨
	 * 3. 객체 지향 프로그래밍의 핵심 개념!
	 */
	void run(){
		System.out.printf("%s 스포츠카가 시속 %dkm/h로 빠르게 달린당~\n",brand,speed);
		System.out.println();
	}

	
}
class Truck extends CarDesign{
	int loadCapacity;
	
	Truck(){
		this("브랜드", 1000, 100);
	}
	
	Truck(String brand, int loadCapacity, int speed){
		super(brand, speed);
		this.loadCapacity = loadCapacity;

	}
	

	void run(){
		System.out.printf("%s의 차가 적재용량이 %dkg이라서 속도를 %dkm/h로 갈수밖에 없네\n",brand,loadCapacity,speed);
		System.out.println();
	}
	
	
}

public class _01_CarDesign {

	public static void main(String[] args) {
		/*
		 * 1. 부모 클래스에는 브랜드와 스피드가 있다 / 생성자로 브랜드와 스피드를 무조건 입력해야하도록 만들어줌
		 *    this() 사용해서 기본값 만들어줌 -> 현대, 100
		 *    기능이 있다! -> 브랜드 : 현대 / 스피드 : 100KM
		 *    
		 * 2. 자식 클래스로 스포츠카를 만들고 부모 클래스의 기능으로 오버라이딩 해서
		 * 		브랜드 + 스포츠카가 speed km/h로 달립니다!
		 * 
		 * 3. 트럭도 만들기 적재용량 속도가 느려짐
		 */
		
		CarDesign normalCar = new CarDesign();
		normalCar.run();
		SportCar ferrari = new SportCar("페라리", 90);
		ferrari.run();
		Truck volvotruck = new Truck("볼보", 5000, 80);
		volvotruck.run();
		
	}

}
