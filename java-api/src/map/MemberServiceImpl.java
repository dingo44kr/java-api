package map;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import grade.Grade;

public class MemberServiceImpl implements MemberService {
	
	private static MemberService service = new MemberServiceImpl();
	
	public static MemberService getService() {
		return service;
	}

	Map<String, Object> map = new HashMap<String, Object>();
	
	@Override
	public void join(String id, String pass, String name, String age, String addr) { // 아이디
		Member temp = new Member();
		temp.setId(id);
		temp.setPass(pass);
		temp.setName(name);
		temp.setAge(age);
		temp.setAddr(addr);
		map.put(id, temp);
	}

	@Override
	public String login(String id, String pass) { // 로그인 생성 함수
		String result = "";
		Member me = new Member();
		/**
		 * 환영합니다. ""에 사시는 ""세 ""님. 
		 * 비밀번호가 다릅니다. 다시 입력해주세요. 
		 * 입력하신 아이디는 존재하지 않거나,
		 * 일치하지 않습니다. map 에서 밸류값만 가져오는 메소드는 map.get("키값")
		 */
		if (map.containsKey(id)) {
			me = (Member) map.get(id);
			if (me.getPass().equals(pass)) {
				result = "환영합니다."+me.getAddr()+"에 사시는 "+me.getAge()+"세 "+me.getName()+"님. "+ "로그인이 완료되셨습니다.";
			} else {
				result = "비밀번호가 다릅니다. 다시 입력해주세요.";
			}
		} else {
			result = "입력하신 아이디는 존재하지 않거나, 일치하지 않습니다.";
		}

		return result;
	}

	@Override
	public int count() {
		return map.size();
	}

	@Override
	public Object searchById(String id) {
		return map.get(id); //입력한 id값이 존재하지 않을 때 안내.
	}
	
	@Override
	public String changePass(String id, String pass)	{
		Member t = new Member();
		t = (Member) map.get(id);
		t.setPass(pass);
		
		return "회원정보는 다음과 같이 변경되셨습니다. \n" + t;
		
	}

	@Override
	public String memberWithdr(String id) {
		map.remove(id);
		return "요청하신"+id+"에 대한 정보가 삭제되었습니다."; // 입력한 아이디정보가 없을 때 안내.
	}
	
}
