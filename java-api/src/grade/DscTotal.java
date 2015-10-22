package grade;

import java.util.Comparator;

/**
 * @file_name  : DscTotal.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 10. 1.
 * @story      : 총점 내림차순
 */
public class DscTotal implements Comparator<Grade> {

	public int compare(Grade front, Grade back) {
		
		return (front.getTotal() > back.getTotal()) ? -1 : front.getTotal() < back.getTotal() ? 1 : 0; // 여기서 숫자는 위치값
		/**
		 * 삼항 연산자
		 * (컨디션) ? -1(true) : (거짓이라면 다시 컨디션을 주고) ? true : false ; 
		 * 
		 * if(){
		 * }else{
		 *    if(){
		 *    }else{
		 *    
		 *    }
		 * }
		 * 
		 */
	}

	
}
