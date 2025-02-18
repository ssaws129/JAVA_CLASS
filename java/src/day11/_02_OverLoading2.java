package day11;

class Book{
	String title;
	String series;
	int page;
	
	Book(){
		title = "아이언맨1";
		series = "아이언맨";
		page = 451;
	}
	Book(String Title){
		title = Title;
		series = "아이언맨";
		page = 451;
	}
	Book(String Title, String Series){
		title = Title;
		series = Series;
		page = 451;
	}
	Book(String Title, String Series, int Page){
		title = Title;
		series = Series;
		page = Page;
	}
	void BookInfo() {
		System.out.printf("책 제목 : %s/ 시리즈 : %s / 페이지 수 : %d\n", title, series, page);
	}
}

public class _02_OverLoading2 {

	public static void main(String[] args) {
		/*
		 * book이라는 클래스
		 * 제목, 시리즈, 페이지 수
		 * 
		 * 기본 생성자 만들고
		 * 각각의 값을 바꿀 수 있는 오버로딩 생성자들을 만들기
		 */
		/////////////////////////////////////////////////////////////
		
		Book basic = new Book();
		                                       //기본
		basic.BookInfo();
		
		/////////////////////////////////////////////////////////////
		
		Book titleChange = new Book("아이언맨2");
												//제목만 다름
		titleChange.BookInfo();
		
		/////////////////////////////////////////////////////////////
		
		Book titleSeriesChange = new Book("어벤져스 엔드게임", "어벤져스");
																		//제목 시리즈가 다름
		titleSeriesChange.BookInfo();
		
		///////////////////////////////////////////////////////////////
		
		Book AllChange = new Book("마법사의 돌", "해리포터" , 800 );
																		//제목 시리즈 페이지수가 다름
		AllChange .BookInfo();
		
		
	}

}
