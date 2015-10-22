package calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @file_name : SimpleDateFormatMain.java
 * @author : dingo44kr@gmail.com
 * @date : 2015. 10. 6.
 * @story :SimpleDateFormat 문법
 */
public class SimpleDateFormatMain {
	public static void main(String[] args) {
		Date today = new Date(); // CTRL, SHIFT + o
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4, sdf5, sdf6;

		sdf1 = new SimpleDateFormat(); // 15. 10. 6 오후 3:59
		sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일"); //2015년 10월 6일 이용일
		sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");

		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		System.out.println(sdf5.format(today));
	}
}
