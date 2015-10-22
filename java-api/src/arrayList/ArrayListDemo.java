package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @file_name  : ArrayListDemo.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 10. 1.
 * @story      : ArrayList 예제
 */
public class ArrayListDemo {
	/**
	 * CRUD
	 * create 추가, 삽입
	 * read 조회, 검색
	 * update 덮어쓰기
	 * delete 삭제 
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // deep copy
		// Create
		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("대구"); // 중복값 입력 가능
		
		List<String> list2 = new ArrayList<String>(); 
		list2.addAll(list);
		
		
		// Read
		// 출력 방법 1. iterator()
		Iterator<String> it = list.iterator(); // shallow copy 얕은 복사
		while (it.hasNext()) { //요소가 존재하지 않을때 까지 돌아라
			System.out.println("출력방법 1 :"+it.next()); // 요소가 존재하면 그것을 반환하고 그 자리로 옮겨가라
		}
		
		System.out.println();
		// 출력 방법 2. 확장 for loop
		for (String str : list) {
			System.out.println("출력방법 2 :"+str);
		}
		// 출력 방법 3. 검색
		System.out.println();
		
		Iterator<String> it2 = list.iterator();
		String search = "";
		while (it2.hasNext()) {
			search = it2.next();
			if (search.startsWith("대")) { // 서울, 부산, 대구, 대구 중에서 앞글자가 대자로 시작한다면
				System.out.println("검색결과 : "+search);
				
			}
		}
		
		
		
		
	}
}
