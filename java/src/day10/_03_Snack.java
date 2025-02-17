package day10;

class Snack {
	
//	int price; 
//	
//	void info() { 
//
//		System.out.println("과자의 가격은 " + price + "원 입니다."); 
//	}
 

	int price;

	Snack(int p) {
		/*
		 * 생성자 선언 : 생성자의 이름은 반드시 클래스의 이름과 같아야 한다. 
		 * 
		 * 생성자 역할
		 * 1. 객체가 생성될 때 필요한 초기값 설정
		 * 2. 메모리 할당 -> 생성자를 호출하면 객체가 메모리에 올라가고 사용할 준비가 됨
		 * 3. 객체 준비 -> 생성자가 실행된 뒤에야 객체의 필드와 메서드를 사용할 수 있다.
		 * -----------------------------------------------------------------
		 * [{외우는게 좋음}]
		 * 1. 클래스
		 * 		어떤것을 만들기위한 설계도
		 * 		(붕어빵 틀)
		 * 2. 객체
		 * 		클래스(설계도)를 기반으로 만들어진것!
		 * 		(사람)
		 * 3. 메서드
		 * 		어떤 것을 만들 때 객체가 사용할 수 있는 기능
		 * 		(잠자기, 밥먹기, 걷기 등등)
		 * 4. 생성자
		 * 		어떤 객체가 생성될 때 기본적으로 가지고 생성되어야하는 값
		 * 		(사람이라면 머리카락, 장기 등등)
		 */
		
		price = p;

	}

	void info() {
		System.out.println("과자의 가격은 " + price + "원 입니다.");
	}
}

public class _03_Snack {

	public static void main(String[] args) {

//		Snack chip = new Snack();
//		chip.price = 2000;
//		chip.();
		Snack chip = new Snack(5000);
		chip.info();
	}

}
