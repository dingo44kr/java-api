package string;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @file_name : StringMethod.java
 * @author : dingo44kr@gmail.com
 * @date : 2015. 10. 5.
 * @story :
 */
public class StringMethod {
	public static void main(String[] args) {
		System.out.println("abcde".contains("f") ? "f가 존재" : "f가 존재하지 않음");

		/**
		 * str1 과 str2 가 같음, str1 과 str2 가 다름
		 */
		String str1 = "abc"; // 반포에 푸르지오
		String str2 = "abc"; // 반포의 푸르지오 "abc"라는 리터럴 값이 상수풀에 존재하는지 체크
		// String result1 = "str1과 str2는 같다."; //삼항 연산자로 (str1 == str2)
		// String result2 = "str1과 str2는 다르다."; //삼항 연산자로 (str1.eqauls(str2))
		System.out.println(str1 == str2 ? "str1과 str2는 같다." : "str1과 str2는 다르다.");
		System.out.println(str1.equals(str2) ? "str1과 str2는 같다." : "str1과 str2는 다르다.");

		String str3 = new String("abc"); // heap에 저장.
		String str4 = new String("abc"); // heap에 저장.
		System.out.println(str3 == str4 ? "str3과 str4는 같다." : "str3과 str4는 다르다."); //주소값은 다르다.
		System.out.println(str3.equals(str4) ? "str3과 str4는 같다." : "str3과 str4는 다르다."); //실제값은 같다.
		/**
		 * == : 주소값을 비교 / 실제로 거주하는 주소를 비교(메모리 어디에 있는가?) / 주소까지 같은 완전 동일 객체
		 * equals() : 실제값(value) 비교 / 주소는 상관없고 실 이름만 동일한지 체크
		 */

		String str5 = "abc"; // 리터럴 객체 //case. heap에 저장
		String str6 = new String("abc"); //case. 상수풀(pool)에 저장
		System.out.println(str5 == str6 ? "str5와 str6은 같다." : "str5와 str6는 다르다.");
		System.out.println(str5.equals(str6) ? "str5와 str6은 같다." : "str5와 str6는 다르다.");
		
		//여기서 "Hello.txt"는 리터럴 객체이다.
		System.out.println("Hello.txt".endsWith("txt") ? "텍스트 파일입니다." : "텍스트 파일이 아닙니다.");
		System.out.println("헬로우".concat(",자바월드!!")); // 헬로우, 자바월드!!
		System.out.println("HELLO".equals("hello") ? "같습니다." : "다릅니다."); // 다릅니다.
		System.out.println("HELLO".equalsIgnoreCase("hello") ? "같습니다." : "다릅니다."); //같습니다.
		System.out.println("Hello Tom".replace("Tom", "Alex")); // Hello Alex
		/**
		 * JDK 5 버전 이전에는 replace() replaceAll() 이 서로 다르게 반응했으나,
		 * 이후에는 서로 같은 기능 (전부 체인지되는 기능)으로 바뀌었다.
		 * 그럼 차이점이 없는가? 하면 정규식에 대한 기능이 있는가 없는가에 차이점이 있다.
		 * replace() 는 기능이 없고 replaceAll() 은 기능이 있다.
		 * 따라서 replaceAll()을 쓰도록 권장하고 있다.
		 */
		System.out.println("[1] A B C D : A B C D".replace("C D", "E F"));
		System.out.println("[1] A B C D : A B C D".replaceAll("C D", "E F"));
		
		/**
		 * . 은 정규식에서 쓰이는데 맨 앞 한글자만 지정합니다.
		 * 그러니까. a는 a앞에 글자와 a까지를 뜻합니다.
		 * 아래 예제에서 replace() 는 . 을 정규식 표현법으로 보질 않고 리터럴의 마침표로 인식함으로
		 * 프로그래밍에서 자주사용하는 정규식을 사용할 수 없게 됩니다.
		 */
		System.out.println("[3] Hello Javan".replace("a", "")); // [3] Hello jvn //정규식을 찍어봐도 먹지 않음
		System.out.println("[4] Hello Javan".replaceAll(".a", "")); //
//		System.out.println(""); // 가장 단순하고 가장 작은 객체(리터럴 객체!) - 점찍어보면 알 수 있음
		System.out.println("Hello. java".toUpperCase());
		System.out.println("Hello. java".toLowerCase());
		System.out.println("Hello. java".length()); //char의 갯수반환, 공백도 갯수로 인정
		System.out.println("Hello. java      ".replaceAll(" ", "").length()); // 공백을 없애고 갯수를 구함
		System.out.println("Hello. java        ".trim().length()); // 트림은 앞뒤 공백만 제거
		System.out.println(1);// Syso은 String 타입만을 반환 할 수 있는데,
		// 이렇게 int 타입을 넣어주면 내부적으로 자동으로 프로모션(업캐스팅, 더 큰그릇에 담는 것)을 진행한다.

		// String str = "Hello.java";
		// System.out.println(str); => System.out.println("hello.java"); 
		// 위에 선언한 str객체를 syso에 가져오는게 아니라 간략화 과정을 통하여
		

		System.out.println(String.valueOf(5)); // 클래스(가) 메소드 호출
		
		System.out.println(String.valueOf("ab")); //"ab"는 상수풀에 있는 주소값을 가지고 있다.
		//String.valueOf("ab")의 결과값은 값 그대로인 ab 를 출력합니다.
		
		/**
		 * Wrapper 클래스(래퍼 클래스 "감싸다")
		 * 기본형 타입 <--> 객체형 타입
		 * byte <--> Byte
		 * short <--> Short
		 * int <--> integer
		 * long <--> Long
		 * char <--> String
		 * boolean <--> Boolean
		 * float <--> Float
		 * double <--> Double
		 */
	
		// byte b = Byte.parseByte("1");
		// short s = Short.parseShort("1");
		// int i = Integer.parseInt("1");
		// long l = Long.parseLong("1.1");
		// boolean boo = Boolean.parseBoolean("true");
		// float f = Float.parseFloat("1.0");
		// double d = Double.parseDouble("3.14");
		
		System.out.println(Byte.parseByte("1"));
		System.out.println(Short.parseShort("1"));
		System.out.println(Integer.parseInt("1"));
		System.out.println(Long.parseLong("1000"));
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Float.parseFloat("1.0"));
		System.out.println(Double.parseDouble("3.14"));
				
	}
}
