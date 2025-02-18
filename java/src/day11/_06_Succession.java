package day11;

class Animal{
	void eat() {
		System.out.println("밥을 먹자 냠냠냠");
	}
	
}
class Dog extends Animal{

	void sound() {
		System.out.println("멍멍멍!!!");
	}
	
}

public class _06_Succession {

	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		myDog.eat();
		
		
	}

}
