package enums;

import java.util.Scanner;

/**
 * @file_name  : EnumMain.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 10. 7.
 * @story	   : 열거형 예제 문제
 */
public class EnumMain {
	/**
	 * 숫자값을 입력하면, 숫자값에 해당하는 방향이 스트링으로 나오게끔
	 * [동쪽으로 이동합니다] 
	 */
	public static void main(String[] args) {
		System.out.println("가고자 하는 방향을 정하세요. 동 : 1 \n 서 : 2 \n 남 : 3 \n 북 : 4"); 
		Scanner scanner = new Scanner(System.in);
		Navigation n = new Navigation();
		n.setDirection(scanner.nextInt());
		System.out.println(n.getDirection());
	}
}