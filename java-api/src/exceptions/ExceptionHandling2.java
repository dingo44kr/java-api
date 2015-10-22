package exceptions;

/**
 * @file_name : ExceptionHandling2.java
 * @author : dingo44kr@gmail.com
 * @date : 2015. 10. 7.
 * @story :
 */
public class ExceptionHandling2 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		int i = 50;
		try {
			int data = Integer.parseInt("a");
			System.out.println(i / data);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("숫자가 아닙니다.");
		} catch (ArithmeticException e) { //14번 라인을 실행하고 끝나므로, 15번 라인 에러는 표시되지 않는다.
		e.printStackTrace();
		System.out.println("그래서 나눌수없죠");
		}
		System.out.println("프로그램 종료");
	}
}
