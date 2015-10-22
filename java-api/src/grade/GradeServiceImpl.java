package grade;

import java.util.Collections;
import java.util.ArrayList;

public class GradeServiceImpl implements GradeService {
	ArrayList<Grade> vec = new ArrayList<Grade>();
	DscTotal dSort = new DscTotal();
	AscName aname = new AscName();

	/*
	 * 학생을 학적부에 등록하기 힌트) 벡터 메소드 중에 한 객체만 넣는 메소드를 사용하세요. = 연산자는 안됨. 한줄 코딩으로 끝
	 */
	@Override
	public void input(String hak, String name, int kor, int eng, int math) {
		Grade grade = new Grade();
		grade.setHak(hak);
		grade.setName(name);
		grade.setKor(kor);
		grade.setEng(eng);
		grade.setMath(math);
		vec.add(grade);
	}

	/**
	 * 학적부에 등록된 전체 학생 리스트 출력 힌트) 필드에 있는 객체에 모든 학생 리스트가 있을 것이다. 필드 객체 값을 지역변수에
	 * 할당하자. 한줄코딩!
	 */
	@Override
	public ArrayList<Grade> getList() {

		return vec;
	}

	/**
	 * 학번으로 벡터를 뒤져서 일치하는 학번 한개만 리턴하기
	 */
	@Override
	public Grade searchByHak(String hak) {
		Grade grade = new Grade();
		for (int i = 0; i < vec.size(); i++) { // 1000 대신에 벡터의 length를 구하는 메소드
												// 찾아 볼 것.
			if (vec.get(i).getHak().equals(hak)) {
				grade = vec.get(i);
			}
		}

		return grade;
	}

	/**
	 * 이름으로 학적부에 등록된 학생정보 전부 검색하기(동명이인일 경우 전부 검색)
	 */
	@Override
	public ArrayList<Grade> searchByName(String name) {
		ArrayList<Grade> temp = new ArrayList<Grade>();
		for (int i = 0; i < vec.size(); i++) { // 벡터의 랭스 함수 찾기.
			if (vec.get(i).getName().equals(name)) {
				temp.add(vec.get(i));
			}
		}
		return temp;
	}

	@Override
	public void descGradeByTotal() {
		Collections.sort(vec, dSort); // 앞의 vec 의 대상으로 가서, dSort 기준으로 배치한다.
	}

	@Override
	public void ascGradeByName() {
		Collections.sort(vec, aname); // 앞의 vec 의 대상으로 가서, aname 기준으로 배치한다.
	}

	/**
	 * 성적 하위순으로 순위 출력(스왑), 배열복사로도 한번 해보기!
	 */
	@Override
	public void ascGradeByTotal() {
		Grade temp = null;
		for (int i = 0; i < vec.size(); i++) {
			for (int j = 0; j < vec.size(); j++) {
				if (vec.get(i).getTotal() < vec.get(j).getTotal()) {
					temp = vec.get(i);
					vec.set(i, vec.get(j));
					vec.set(j, temp);
				}
			}
		}
	
	}


}
