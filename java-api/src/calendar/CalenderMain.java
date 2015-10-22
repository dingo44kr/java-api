package calendar;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

import grade.Grade;

/**
 * @file_name : CalenderMain.java
 * @author : dingo44kr@gmail.com
 * @date : 2015. 10. 6.
 * @story : Calendar 클래스
 */
public class CalenderMain {
	/**
	 * 특정일(2015-9-14)로 부터 오늘까지 일수 구하기
	 * 2016-02-05 에서 오늘날짜까지 남은 일수 구하기 (D-18) // 외부에서 입력받기
	 * 영화 상영날짜에 응용 구현.
	 */
	public static void main(String[] args) {
		/*
		Grade a = new Grade();
		a.getHak(); // 인스턴스 호출
		Calendar startDay = Calendar.getInstance(); // 스태틱 메소드, rt.jar 에 getInstance() 위치값(주소)를 호출
		Calendar today = Calendar.getInstance();
		*/
		
		DayCount set = new DayCount();
		Scanner scanner = new Scanner(System.in);
		System.out.println("D-day를 구하려는 기준 날짜를 입력해 주세요.");
		System.out.println("\"year-month-day\" 형식으로 입력해주세요");
		System.out.println(set.setday(scanner.next()));

	}
}

class DayCount{
	
	public String setday(String thatNo) {
		Calendar startDay = Calendar.getInstance(); // 스태틱 메소드 getInstance 기능을 starDay 에 담는다. // rt. jar에 getInstance() 위치값(주소)를 호출
		Calendar today = Calendar.getInstance(); //원하는 기준 연 월 일을 입력받음
		
		StringTokenizer tok = new StringTokenizer(thatNo, "-");
		
		String result;
		startDay.set(Integer.parseInt(tok.nextToken()), 
					 Integer.parseInt(tok.nextToken()) - 1, 
					 Integer.parseInt(tok.nextToken())); // 실제값보다 월이 1이 작다. 1~12월을 배열로 담음 [0] = 1월  [1] = 2월 // 날짜를 set 함.
		if (startDay.getTimeInMillis() < today.getTimeInMillis()) {
			result = "입력하신 날짜는 이미 지나신 과거날짜 입니다. 다시 입력해주세요.";
		} else {
			int workDays = (int) Math
					.ceil((startDay.getTimeInMillis() - today.getTimeInMillis()) / (24 * 60 * 60 * 1000));
			result = "D-day " + workDays + " 일";
		}
		return result;
//		startDay.getTimeInMillis(); // 특정일에 해당하는 int 값을 가져옴 (1970.01.01 부터 누적된 초단위)
		}
}
