package day15;

import java.util.Arrays; //  리스트를 배열로 바꿈
import java.util.Collections; //바꿔진 리스트를 조정 
import java.util.List; //배열을 리스트처럼 사용함
import java.util.Scanner;
public class _01_QuizGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String question = "자바의 창시자는 누구인가?";
		String correctAnswer = "제임스 고슬링";
		//제임스 고슬링 / 빌게이츠 / 스티브 잡스 / 린우스 토발즈
		
		String[] answers = {"제임스 고슬링", "빌게이츠", "스티브 잡스", "린우스 토발즈"};
		
		List<String> answerList = Arrays.asList(answers);
		//List : 크기를 유동적으로 조절할 수 있는 자료구조 이다. 리스트로 변환하면 정렬, 섞기, 추가, 삭제, 등 자유롭게 가능
		
		Collections.shuffle(answerList); //Collections 의 기능을 이용하여 섞는것
		
		System.out.println("퀴즈 : " + question);
		
		for(int i = 0; i<answerList.size(); i++) {
			System.out.println((i+1) + "." + answerList.get(i));
			
		}
		System.out.print("정답 번호를 입력하세요 : ");
		
		int userChoice = scan.nextInt();
		
		String userAnswer = answerList.get(userChoice - 1);
		
		if(userAnswer.equals(correctAnswer)) {
			System.out.println("정답입니다!");
		}
		else{
			System.out.println("틀렸습니다! 정답은" + correctAnswer + "입니다!!");
		}
		scan.close();
	}

}
