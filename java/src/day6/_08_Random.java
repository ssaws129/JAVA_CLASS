package day6;

public class _08_Random {

	public static void main(String[] args) {
		int randomInt = (int)(Math.random() * 10) + 1;
		System.out.println("랜덤 정수 : " + randomInt);
		/*
		Math.random() : 0.0 이상 1.0 미만의 실수를 반환
		(int) : 소수점을 버림 
		0~2가 안나오기위해서 +1을 해줌
		
		 */
		
		
	}

}
