package day8;
import java.util.Scanner;
public class _03_ArrayTarget {

	public static void main(String[] args) {
		/*
		 * 숫자 5개가 들어간 배열
		 * 입력받은 숫자가 배열에 들어있는지 확인
		 * 들어있다면 target(숫자)은 배열에 있습니다 (없습니다.)
		 * Tip : 입력받은 숫자를 찾았는지 못찾앗는지 판단하는 변수를 만들어 놓으면 편함
		 * 향상된 for문 사용
		 */
		Scanner NumInput = new Scanner(System.in);
		
		int[] Arrnum = {5,6,23,16,1};
		
		
		
		System.out.println("숫자를 입력해주세요 : ");
		
		int num = NumInput.nextInt();
		
		boolean found = false;
		
		for(int i:Arrnum) {
			
			if(num == i) {
			
				found = true;
				break;
			}
			
		}
		if(found) {
			
			System.out.printf("target(%d)은(는) 배열에 있습니다\n", num);
			
		}
		else {
			
			System.out.printf("target(%d)은(는) 배열에 없습니다\n", num);
		}
		NumInput.close();
	}

}
