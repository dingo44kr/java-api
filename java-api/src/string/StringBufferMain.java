package string;

public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("java"+"programming"); // 두개의 주소값 참조 => 비추 // 미국을 두번 갔다옴
		System.out.println(sb.append("java").append("programming").toString()); //결합시킨 하나의 주소값만 참조 // 미국을 한번만 갔다옴
		// 체이닝기법
		System.out.println(sb.length()); // 실제 문자수 
		System.out.println(sb.capacity()); // 할당된 배열 사이즈
		
		sb.replace(0, 4, "C++"); // 0 이상 : 시작인덱스 포함      4 미만 : 끝 인덱스는 불포함 // 0부터 4미만까지 지우고, 앞의 ""로 재 설정 
		System.out.println(sb);
		System.out.println(sb.reverse()); // gnimmargorp++C (역)
		System.out.println(sb.reverse()); // 다시 역으로 C++programming
		System.out.println(sb.substring(11)); // 인덱스 11번째 부터 인덱스 끝까지
		StringBuffer sb1 = new StringBuffer("홍길동");
		StringBuffer sb2 = new StringBuffer("홍길동");
		System.out.println(sb1==sb2); //만약 String 이라면 reference(주소값) 비교 -> false
		System.out.println(sb1.equals(sb2)); // String 이라도  value 비교 -> true
		/**
		 * StringBuffer 는 무조건 레퍼런스(주소값) 비교만 한다.
		 */
		
	}
}
