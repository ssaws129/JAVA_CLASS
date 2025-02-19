package day11;

class Animal{
	void eat() {
		System.out.println("밥을 먹자 냠냠냠");
	}
	
}
class Dog extends Animal{

	void soundDog() {
		System.out.println("멍멍멍!!!");
	}
	
	@Override
	void eat() {
		System.out.println("밥을 먹자 멍멍멍~~~");
	}
	
}

class Cat extends Animal{
	
	void soundCat() {
		System.out.println("냐옹");
	}
	
	@Override
	void eat() {
		System.out.println("밥을 먹자 냥냥냥~~~");
	}
}

public class _06_Succession {

	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		myDog.eat();
		
		Cat myCat = new Cat();
		myCat.soundCat();
		myCat.eat();
		
		
	}

}
