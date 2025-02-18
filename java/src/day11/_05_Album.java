package day11;

class Album{
	String title;
	String singer;
	int songNum;
	boolean member;

	
	Album(){
		this("제목", "가수", 0, false);
	}
	
	
	Album(String title,String singer, int songNum, boolean member){
		this.title = title;
		this.singer = singer;
		this.songNum = songNum;
		this.member = member;
	}
	
	void albumInfo() {
		
		System.out.printf("앨범의 제목♪♪♪ : %s\n", this.title);
		System.out.printf("가수♬ : %s\n", this.singer);
		System.out.printf("수록곡 개수 : %d\n", this.songNum);
		System.out.println("지니뮤직 회원인가요? : " + this.member);
		System.out.println("----------------------");
	}
}

public class _05_Album {

	public static void main(String[] args) {
		/*
		 * 앨범의 제목, 가수, 수록곡 개수 필드로 만들고
		 * this를 사용한 생성자를 활용해서 객체를 생성한 뒤 정보 출력하기
		 * 앨범 제목 :
		 * 가수 : 
		 * 수록곡 개수 : **곡
		 */
		System.out.println("----------------------");
		Album singer1 = new Album("1집", "이수", 13, true);
		singer1.albumInfo();
		
		
		Album singer2 = new Album();
		singer2.albumInfo();
		
		

	}
	
	
	

}
