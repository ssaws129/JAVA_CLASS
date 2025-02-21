package day14;

import java.util.Calendar;

public class _05_JavaUtilCalendar {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH); //달에 대한 day값
		
		System.out.printf("오늘 날짜는 : %d년 %d월 %d일 입니다.\n", year, month, day);
	}

}
