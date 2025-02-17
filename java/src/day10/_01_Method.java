package day10;

class Greeter{
	public void hello() {
		
		System.out.println("리턴값 없는 안녕하세요.");
		
	}
	
}

class Calculator{
	public int add(int a, int b) {
		
		return a + b;
	
	} //모듈(기본)
}

public class _01_Method {

	public static void main(String[] args) {
		/*
		 * 메서드 구성 요소
		 * 1. 리턴 타입 : 메서드가 작업을 수행한 후 돌려주는 값의 타입
		 * 2. 메서드 이름 : 메서드의 이름은 동사를 사용해서 동작을 명확하게 표현한다.
		 * 3. 매개변수(파라미터): 메서드에 입력값을 전달하기 위해 사용하는 변수
		 */
		
		Greeter greeter = new Greeter();
		
		greeter.hello(); //호출하는것이 필요 ex) .hello() / .메서드 이름 (매개변수 값)
		
		Calculator calculator = new Calculator();
		
		int result = calculator.add(5, 3);  //매개변수 a 와 b 가 들어감
		
		System.out.println("결과 : " + result);
		
	}

}
