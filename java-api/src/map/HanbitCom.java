package map;

import java.util.Scanner;

public class HanbitCom {
	/**
	 * "안녕하세요".substring(0,2); 0이상 2미만 "안녕"
	 */
	public static void main(String[] args) {
		/**
		 * CRUD
		 * Create : 추가
		 * Read : 검색
		 * Update : 수정
		 * Delete : 삭제
		 */
		Scanner scanner = new Scanner(System.in);
		MemberService service = MemberServiceImpl.getService();
		{
			while (true) {
				System.out.println("1: 회원가입  2: 로그인  3: 총회원수  4: ID검색 5: 비밀번호 변경 6. 회원탈퇴 7. 종료");

				switch (scanner.nextInt()) {
				case 1: // 회원가입
					System.out.println("아이디를 입력하세요.");
					String id = scanner.next();
					System.out.println("비밀번호를 입력하세요.");
					String pass = scanner.next();
					System.out.println("이름을 입력하세요.");
					String name = scanner.next();
					System.out.println("나이를 입력하세요");
					String age = scanner.next();
					System.out.println("주소를 입력해주세요");
					String addr = scanner.next();
					service.join(id, pass, name, age, addr);
					System.out.println("축하드립니다. 회원가입이 완료되었습니다.");
					break;
				case 2: // 로그인
					System.out.println("아이디를 입력해주세요");
					String logid = scanner.next();
					System.out.println("비밀번호를 입력해주세요");
					String logpass = scanner.next();
					System.out.println(service.login(logid, logpass));
					break;

				// switch (flag) {
				// case "환영": System.out.println(result);
				// //현실에서는 로그인 페이지 전환
				// break;
				//
				// case "비번": System.out.println(result);
				// //현실에서는 로그인 페이지 다시 보여줌
				// break;
				// case "입력": System.out.println(result);
				// //현실에서는 회원가입 페이지 보여줌
				// break;
				// default:
				// break;
				// }
				case 3: // 총 회원수
					System.out.println("총 회원수는" + service.count() + "명 입니다.");
					break;
				case 4: // 아이디 검색
					System.out.println("검색하실 아이디를 입력해주세요.");
					String searchId = scanner.next();
					System.out.println(service.searchById(searchId));
					break;
				case 5: // 비밀번호 변경
					System.out.println("패스워드를 변경하실 아이디를 입력해주세요.");
					String changeId = scanner.next();
					System.out.println("비밀번호를 무엇으로 변경하시겠습니까?");
					String changePass = scanner.next();
					System.out.println(service.changePass(changeId, changePass));
					break;

				case 6: // 회원 탈퇴
					System.out.println("탈퇴를 요청하실 ID를 입력 해 주세요.");
					String withdrId = scanner.next();
					System.out.println(service.memberWithdr(withdrId));
					break;
				case 7: // 종료
					return;
				default:
					break;
				}
			}
		}
	}
}
