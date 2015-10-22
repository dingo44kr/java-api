package sort;

import java.util.Arrays;
import java.util.Vector;
/**
 * @file_name  : AscSort.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 10. 1.
 * @story      : 오름 그리고 내림차순 정렬 (스왑)
 */
public class SortDemo {
	public static void main(String[] args) {
		System.out.println("==========오름차순===========");
		Vector<Integer> vec = new Vector<Integer>(); // 숫자를 담는 vec 상자를 만든다!(Wrapper 클래스 Integer)
		int[] arr = {2, 5, 68, 79, 123, 4, 9};
		int temp = 0;
		Arrays.sort(arr); //오름차순 정렬 메소드
		for (int i : arr) {
			vec.add(i);
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i]<arr[j]) {
//					temp = arr[i]; // 스왑정렬
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		for (int i : arr) {
			vec.add(i);
		}
		System.out.println(vec.toString());
		
		
		System.out.println("========내림차순========");
		Vector<Integer> vec2 = new Vector<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			vec2.add(i);
		}
		System.out.println(vec2.toString());
	}
}
