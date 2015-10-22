package string;
/**
 * @file_name  : StringDemo.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 10. 5.
 * @story      : String 클래스 
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "한빛", s2 = "한빛"; // 리터럴 표기법(notation)
		//상수풀(pool) 에 이미 존재하는 "한빛"을 재사용하는 구문...추천
		if (s1 == s2) {
			System.out.println("s1 과 s2는 밸류는 같고, [주소값] 같다");
		} else {
			System.out.println("s1 과 s2는 밸류는 같고, [주소값] 다르다");
		}
		String s3 = new String("한빛"), s4 = new String("한빛"); // 생성자 //똑같은 기능을 하는 똑같은 두 녀석을 따로 만드는것 - "한빛이라는 스트링값을 새로 만들어라"
		//위 구문은 메모리 낭비를 초래하므로 비추.
		if (s3 == s4) {
			System.out.println("s3 과 s4는 밸류는 같고, [주소값] 같다");
		}else {
			System.out.println("s3 과 s4는 밸류는 같고, [주소값] 다르다");
		}
	}
}