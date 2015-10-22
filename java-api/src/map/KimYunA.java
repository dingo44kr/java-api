package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @file_name  : KimYunA.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 10. 2.
 * @story      : HashMap 예제
 */
public class KimYunA {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김요나", new Integer(98)); // Integer i = new Integer(98) => int i = 98
		map.put("아사다마오", new Integer(66));
		map.put("소트니코바", new Integer(10));
		
		Set set = map.entrySet();
		Iterator it = set.iterator(); // shallow copy //set의 iterator 기능을 it에 담음.
		while (it.hasNext()) { // 다음이 있을 때까지 while문 안을 반복!! (중요-hasNext의 개념 -> 다음요소가 있다면 true를 반환한다.) p.370 page
			Map.Entry e = (Entry) it.next();
			System.out.println("참가자 : " +e.getKey() + ", 점수 :"+e.getValue());
		}
		set = map.keySet();
		System.out.println("참가자 명단 :"+set); // 자료구조는 내부적으로 for문과 toString()이 내장되어 있다.
		
		Collection values = map.values(); //map에 저장된 Value들만 Collection 인터페이스로 반환.
		it = values.iterator(); // it 은 Values에 있는 iterator를 저장.
		int total = 0; // total 값 초기화
		while (it.hasNext()) { // it의 hasNext 실행.(iterator 의 hasNext 메서드 실행) // "요소가 있을 때까지 true를 반환하여 아래 식 수행"
			Integer i = (Integer) it.next(); // next -> 반복처리에 있어 다음 요소를 반환하고, 현재 위치를 반환된 요소의 자리로 이동한다.
			total += i.intValue(); // total에 i의 intValue 실행하여 담는다. (계속 total의 값은 증가. - 대입연산자/더하여 total에 넣고, 넣고, 넣고)
		}
		
		System.out.println("대회총점 :" + total);
		System.out.println("대회평균 :" + total/set.size());
		System.out.println("대회 최고점 :"+Collections.max(values));
		System.out.println("대회 최저점 :"+Collections.min(values));
	}	
}
