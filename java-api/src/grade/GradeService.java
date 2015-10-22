package grade;

import java.util.ArrayList;

public interface GradeService {
	public void input(String hak, String name, int kor, int eng, int math);
	public ArrayList<Grade> getList();
	public Grade searchByHak(String hak);
	public ArrayList<Grade> searchByName(String name);
	public void descGradeByTotal(); // 성적을 내림차순으로 정렬 (300, 270, 230, ...)
	public void ascGradeByName(); //   성적을 이름에 따라 오름차순(ㄱ,ㄴ,ㄷ, ...) 정렬
	public void ascGradeByTotal(); // 성적 정렬
}
