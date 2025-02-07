package day4;

import java.util.Scanner;

public class _02_Arithmetic {

	public static void main(String[] args) {
		/*
		 *  분을 정수로 입력 받아서 몇시간 몇분으로 환산하는 프로그램 만들기
		 */
		System.out.print("분 입력 : ");
		Scanner Input = new Scanner(System.in);
		int result = Input.nextInt();
		Input.close();
		int min = result % 60;
		int hour = result / 60; 
		System.out.printf("%d시간 %d분입니다.",hour, min);
		
	}

}
