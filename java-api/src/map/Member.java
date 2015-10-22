package map;

public class Member {
	private String name; // 회원이름
	private String addr; // 주소
	private String age; // 나이
	private String pass; // 비번
	private String id; // 아이디
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "회원정보 \n 이름: " + name + "\n 주소: " + addr + "\n 나이: " + age + "\n ID: " + 
	id + "\n 비밀번호: " + pass;
	}
	
}
