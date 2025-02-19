package day12;



final class Parent{
	void printText() {
		System.out.println("파이널 클래스");
	}
}

//class child extends Parent{
//	
//}

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	final void infoTitle() {
		System.out.printf("책 제목 : %s\n", title);
	}
	
	void infoAuthor() {
		System.out.printf("책의 저자는 %s입니다.\n",author);
	}
}

class Comic extends Book{
	boolean isColor;
	
	Comic(String title, String author,boolean isColor){
		super(title,author);
		this.isColor = isColor;
	}
	
	
//	void infoTitle() {
//		System.out.printf("책 제목 : %s\n", title);
//	}
	@Override 
	void infoAuthor() {
		System.out.printf("책의 저자는 %s입니다.\n",author);
	}
	
	void infoColor() {
		if(isColor) {
			System.out.println("이 만화책은 컬러입니다.");
		}
		else {
			System.out.println("이 만화책은 흑백입니다.");
		}
	}
}

public class _02_Final {

	public static void main(String[] args) {
		/*
		 * 파이널
		 * 1. 파이널 키워드는 클래스, 메서드, 변수에 사용할 수 있다.
		 * 2. 한 번 정하면 변경 불가! (상수 개념)
		 * 3. 파이널 키워드로 클래스를 만들면 어떤 클래스도 파이널 클래스의 자식 클래스가 될 수 없다.
		 * 
		 */
		Comic comicbook = new Comic("명탐정 코난", "아오야마고쇼",true);
		comicbook.infoTitle();
		comicbook.infoAuthor();
		comicbook.infoColor();
		/*
		 * 1. 상속이란 부모역할을 하는 클래스가 자식 역할을 하는 클래스에게 필드, 메서드 등을 물려주는 것을 뜻한다.
		 * 
		 * 2. 자식 클래스 선언 방법 : extends 키워드
		 * 
		 * 3. super() -> 자식 클래스에서 부모 클래스의 생성자를 호출하는 키워드로 사용한다.
		 * 	  생성자의 매개변수를 전달할 수도 있음
		 * 
		 * 4. 오버라이딩이란? 부모클래스에 선언된 메서드를 자식클래스에서 입맛에 맞게 바꿔서 작성하는 것!
		 * 
		 */
		
		
	}

}
