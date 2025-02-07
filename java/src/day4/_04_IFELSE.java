package day4;

import java.util.Scanner;

public class _04_IFELSE {

	public static void main(String[] args) {
		int a = 10;
		if(a > 15) {
			System.out.println("조건을 충족합니다.");
		}
		else {
			System.out.println("조건을 불충족합니다.");
		}
		
		/*
		 * 국영수 점수를 입력 받아서 각 과목이 60점 이상이면 합격
		 * 한 과목이라도 60 점 미만 이라면 불합격
		 */
		System.out.print("국영수 점수를 입력해주세요 : ");
		Scanner Input = new Scanner(System.in);
		int k_language = Input.nextInt();
		int math = Input.nextInt();
		int english = Input.nextInt();
		Input.close();
		if(k_language < 60 || math < 60 || english < 60) {
			System.out.println("불합격");
		}
		else 
		{
			System.out.println("합격");
		}
	s
	}

}
