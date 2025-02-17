package day10;

class Student{
	String name; //필드
	int grade;
	int EngScore;
	int MathScore;

	public double average() { //메서드
		
		return (MathScore + EngScore)/2.0 ;
	}
	
	public void StudentInfo() {
		System.out.printf("이름은 %s입니다.\n", name );
		System.out.println();
		System.out.printf("학년은 %d학년입니다.\n", grade );
		System.out.println();
		System.out.printf("영어점수는 %d점이고 수학점수는 %d점이기 때문에 평균점수는 %.1f점입니다.\n", EngScore, MathScore, average() );
		System.out.println("---------------------------------------------------------");
	}
	Student(String Name, int Grade, int engscore, int mathscore){
		name = Name;
		grade = Grade;
		EngScore = engscore;
		MathScore = mathscore;
		
	}
	
}

public class _02_MethodStudent {

	public static void main(String[] args) {
		/*
		 * 이름, 학년, 영어 점수, 수학점수 필드가 들어있는 클래스를 만들고
		 * 평균을 구하는 메서드를 만들어서 철수, 영희의 정보를 출력해보기
		 */
		
		Student student1 = new Student("영희", 2, 99, 87);		
//		student1.name = "영희";
//		student1.grade = 2;
//		student1.EngScore = 99;
//		student1.MathScore = 87;
		System.out.println("---------------------------------------------------------");
		student1.StudentInfo();
//		
		Student student2 = new Student("철수", 3, 61, 34);
//		student2.name = "철수";
//		student2.grade = 3;
//		student2.EngScore = 61;
//		student2.MathScore = 34;
//		
		student2.StudentInfo();
		
		
			
	}
		
}