package exceptions;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("프로그램에서 시작됨");
		int[] arr = { 10, 20, 30 };
		for (int i = 0; i <= arr.length; i++) {
			//try catch 부분은 최대한 짧게 코딩하여야 좋다.
			try {
				System.out.println(arr[i] + "\t");
			} catch (Exception e) { //Exception이 최상위.
				e.printStackTrace();  //실행시 에러가 나는 부분을 프린트 / syso("에러발생"); 이렇게도 사용할 수 있다.
			}
		}
		System.out.println("프로그램이 종료됨");
	}
}
