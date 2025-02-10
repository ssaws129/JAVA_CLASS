package day5;

import java.util.Scanner;

public class _01_NestingIf {

	public static void main(String[] args) {
		/*
		 * 중첩 if : if문 안에 if문이 들어가는 구조
		 * 
		 * if(조건1){ 조건 1을 만족하면 실행할 코드 if(조건2){ 조건 1을 만족하면서 2도 만족하면 실행할 코드 }else{ 조건 1을
		 * 만족하지만 조건 2는 만족하지 않음 } }else{ 조건1을 만족하지 않았을때 실행 }
		 * 
		 */
		/*
		 * if(10 > 20) { System.out.println("20이 10보다 크다"); if(50 < 30) {
		 * System.out.println("50이 30보다 크다."); } else {
		 * System.out.println("30은 가장 크지 않다."); } }else {
		 * System.out.println("뭔가 잘못됨!!"); } //1번째 if문의 조건이 만족해야만 안쪽 if문을 검사할 수 있는 기회가
		 * 주어짐
		 * 
		 * 
		 * 1.놀이 기구를 타려면 키가 120이 넘어야 하고 2. 120이 넘더라도 나이가 10살 미만이라면 보호자가 필수.
		 * 
		 * System.out.print("키를 입력해주세요 : "); Scanner Info = new Scanner(System.in);
		 * double tall; int age; tall = Info.nextDouble(); if(tall > 120) {
		 * System.out.print("나이를 입력해주세요 : "); age = Info.nextInt(); if(age < 10) {
		 * 
		 * System.out.println("나이가 어려 입장할 수 없습니다."); } else {
		 * System.out.println("입장할 수 있습니다."); } } else {
		 * System.out.println("키가 작아 입장할 수 없습니다."); } Info.close();
		 */
		/*
		 * 학생출석 및 과제 제출 여부 1. 학생 출석 확인 (yes, no) 2. 과제 제출했는지 확인 (yes, no) 3. 제출 했다면 - 수업
		 * 참여 인정 4. 과제 제출 X - 50%출석 인정 5. 출석평가에서 -3점 감점됨
		 * 
		 * String 변수명.next(); 
		 * 변수명.equalsIgnoreCase(""); 문자열 비교할 때 사용하는 메서드
		 * equals() 대소문자 구분
		 *	if(변수명 == "내용") 주소와 비교하는거라 안된다.
		 */
		
		Scanner Attend = new Scanner(System.in);
		
		System.out.print("출석 확인(yes, no) : ");
		
		String att = Attend.next();
		
		if (att.equalsIgnoreCase("yes")) {
			
			Scanner Homework = new Scanner(System.in);
			
			System.out.print("과제 제출 확인(yes, no) : ");
			
			String work = Homework.next();
			
			Attend.close();
			//스캐너 클로즈는 모든 스캐너 끝난후에 클로즈
			Homework.close();
			
			if (work.equalsIgnoreCase("yes")) {
				
				System.out.println("수업 참여 인정");
				
			} else {
				
				System.out.println("50%출석 인정");
				
			}
		} else {
			
			System.out.println("출석 평가에서 -3점 감점");
			
		}

	}

}
