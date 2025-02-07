package day4;

public class _05_MULTIPLEIF {

	public static void main(String[] args) {
		/*
		 * if(조건1){
		 * 		조건1이 참일때 실행
		 * }else if(조건2){
		 * 		조건2가 참일때 실행
		 * }
		 * else
		 * {
		 * 		모든 조건에 부합하지 않을 경우 실행
		 * }
		 */
		int age = 12;
		int fee;
		if(age <= 5) {
			fee = 0; //5세 이하 무료
			
		}
		else if(age <= 12) {
			fee = 5000; //6~12세
			
		}
		else if(age <= 18) {
			fee = 8000; //13~18세
		}
		else {
			fee = 10000; //성인
		}
		System.out.println("입장료는"+ fee +"원 입니다.");
	}	

}
