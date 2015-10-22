package grade;

import java.util.Scanner;

/**
 * @file_name : HanbitSchool.java
 * @author : dingo44kr@gmail.com
 * @date : 2015. 10. 1.
 * @story : 메인 메서드 (입출 및 동작 메서드)
 */
public class HanbitSchool {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService service = new GradeServiceImpl();

		while (true) {
			System.out.println("1:성적등록  2:학적부리스트보기  3:학번으로 검색  4:이름으로 검색  "
					+ "5:성적 상위순으로 순위출력 6.성적 하위순으로 순위출력(스왑) 7:이름 오름차순 출력  8:종료");
			switch (scanner.nextInt()) {
			case 1:
				String hak, name;
				int kor, eng, math;
				System.out.println("학번을 입력해주세요");
				hak = scanner.next();
				System.out.println("이름을 입력해주세요");
				name = scanner.next();
				System.out.println("국어");
				kor = scanner.nextInt();
				System.out.println("영어");
				eng = scanner.nextInt();
				System.out.println("수학");
				math = scanner.nextInt();
				service.input(hak, name, kor, eng, math);
				break;
			case 2:
				System.out.println("학적부 리스트 입니다.");
				System.out.println(service.getList());
				break;
			case 3:
				System.out.println("검색하실 학번을 입력해주세요.");
				String searchHak = scanner.next();
				System.out.println(service.searchByHak(searchHak));
				break;
			case 4:
				System.out.println("검색하실 이름을 입력해주세요.");
				String searchName = scanner.next();
				System.out.println("검색하신 이름의 학적부입니다."+service.searchByName(searchName));
				break;
			case 5:
				service.descGradeByTotal();
				System.out.println(service.getList());
				break;
			case 6:
				service.ascGradeByTotal();
				System.out.println(service.getList());
				
				break;
			case 7:
				service.ascGradeByName();
				System.out.println(service.getList());
				break;
			case 8:
				return;
			default:
				break;
			}
		}
	}
}
