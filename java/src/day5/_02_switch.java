package day5;
import java.util.Scanner;
public class _02_switch {

	public static void main(String[] args) {
		/*
		 * switch(변수 또는 연산식){
		 * case 1:
		 * 		케이스1을 충족한다면 실행할 코드
		 * 		break;
		 *  case 2:
		 * 		케이스2를 충족한다면 실행할 코드
		 * 		break;
		 *  case 23:
		 * 		케이스3을 충족한다면 실행할 코드
		 * 		break;
		 * 	default:
		 * 		모든 케이스에 부합하지 않다면 실행될 코드
		 * }
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력(1 : 가위, 2: 바위, 3: 보) : ");
		int n;
		n = input.nextInt();
		/*
		 * if(n == 1) { System.out.println("가위"); } else if(n == 2) {
		 * System.out.println("바위"); } else if(n == 3){ System.out.println("보"); } else
		 * { System.out.println("오류"); } input.close();
		 */
		switch(n) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
			break;
		default: //if문의 else와 같은 역할
			System.out.println("스위치문 오류");
		}
		
		
	}

}
