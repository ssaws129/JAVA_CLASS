package day13;



abstract class Food{
	abstract void recipe();
	
}
class Pizza extends Food{

	@Override
	void recipe() {
		System.out.println("피자 만드는 방법은 도우 반죽을 만들고 도우를 넓게 펴서 토마토 소스를 바르고 위에 토핑 올리고 치즈 올리고 180도 오븐에 구우면됨");
		System.out.println();
	}
	
	
}
class Ramen extends Food{
	@Override
	void recipe() {
		System.out.println("라면 만드는 방법은 물넣고 끓으면 스프넣고 면넣고 한번더 끓이면됨 ");
		System.out.println();
	}
}


public class _04_AbstactClassFood {

	public static void main(String[] args) {
		/*
		 * 요리 방법(추상메서드)이 들어있는 추상 클래스 만들기
		 * 피자 클래스 - 추상클래스 상속받기
		 * 라면 클래스 - 추상클래스 상속받기
		 */
		
		Food pizzaRe = new Pizza();
		
		pizzaRe.recipe();
		
		Food ramenRe = new Ramen();
		
		ramenRe.recipe();

	}

}
