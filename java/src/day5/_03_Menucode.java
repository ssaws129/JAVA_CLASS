package day5;
import java.util.Scanner;
public class _03_Menucode {

	public static void main(String[] args) {
		/*
		 * f나 F를 입력했다면 File Menu출력
		 * h나 H를 입력했다면 help Menu출력
		 * e나 E를 입력했다면 Edit Menu출력
		 * 변수.next().charat(0);
		 */
		
		Scanner Keyinput = new Scanner(System.in);
		System.out.print("f, h, e 대문자 소문자 상관없이 입력해주세요 : ");
		char key;
		key = Keyinput.next().charAt(0);
		if(key == 'f' || key == 'F') {
			System.out.println("File Menu");
		}
		else if(key == 'h' || key == 'H') {
			System.out.println("Help Menu");
		}
		else if(key == 'e' || key == 'E') {
			System.out.println("Edit Menu");
		}
		else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		Scanner Scankey = new Scanner(System.in);
		System.out.print("f, h, e 대문자 소문자 상관없이 입력해주세요 : ");
		char scankey;
		
		scankey = Scankey.next().charAt(0);
		
		switch(scankey) {
		case 'f':
		case 'F':
			System.out.println("File Menu");
			break;
		case 'h':
		case 'H':
			System.out.println("Help Menu");
			break;
		case 'e':
		case 'E':
			System.out.println("Edit Menu");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		Scankey.close();
		Keyinput.close();
	}

}
