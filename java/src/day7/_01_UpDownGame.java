package day7;
import java.util.Scanner;
public class _01_UpDownGame {

	public static void main(String[] args) {
		/*
		 *
		 *1~50 의 난수를 생성할것
		 *숫자를 입력하세요 (잔여 횟수 : 5) 5번 받을거임
		 *정답을 맞췄다면 종료됨
		 *정답보다 숫자가 크다면 업 작다면 다운
		 *5번의 기회를 모두 소진하면 실패
		 */
		int num;
		
		int randomnum = (int)(Math.random()*50)+1;
		boolean match = false;
		for(int i = 1; i<=5; i++) {
			Scanner numInput = new Scanner(System.in);
				
			System.out.printf("숫자를 입력하세요(잔여 횟수 : %d) : ",i);
			
			num = numInput.nextInt();
			
			if(i == 5) {
				System.out.println("5번 기회 소진 종료");
				break;
				
			}
			else if(num > randomnum  ) {
				System.out.println("다운");
					
			}
			else if(num < randomnum) {
				System.out.println("업");
					
			}
			else if(num == randomnum) {
				System.out.println("정답입니다!");
				break;
				
			}
			
		}
		/*
		 * 123 -> if,switch에 대한 자세한 내용
		 * 142 -> for, while 정리
		 */
			
	}
	

}
