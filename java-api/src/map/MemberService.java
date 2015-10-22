package map;

public interface MemberService {
	// 회원가입
	public void join(String id, String pass, String name, String age, String addr);

	// 로그인
	public String login(String id, String pass);

	// 총 회원수
	public int count();

	// 아이디 검색
	public Object searchById(String id);

	// 비밀번호 변경
	public String changePass(String id, String pass);

	// 회원 탈퇴
	public String memberWithdr(String id);
	
}
