package enums;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class ToyRegister {
	private Vector<Toy> toys;
	private Toy toy;
	public ToyRegister() {
		this(10,5);
	}
	public	ToyRegister(int capa, int increment){
		//capa 리스트의 현재 적재용량. increment 적재용량이 넘어서면 증가되는 값
		toys = new Vector<Toy>(capa, increment);
	}
	
	/**
	 * 장난감 등록 
	 */
	public void regist(String name, int price, ToySpec spec){
		Toy toy = new Toy(name, price, spec);
		toys.add(toy);
	}
	
	/**
	 * 상품명으로 검색하는 엔진
	 * 예) 스파이더맨을 입력하면 관련 스펙이 출력되는 로직
	 */
	public Vector<Toy> searchName(String name) {
		Vector<Toy> temp = new Vector<Toy>();
		for (int i = 0; i < toys.size(); i++) {
			while (toy instanceof Toy) {
				if (name.equals(toys.elementAt(i).getName())) {  
					
					// condition 을 채우세요
					// 조건에 맞는 답을 채우세요
				}

			}
		}
		return temp;
	}
	

	/**
	 * 스펙을 가지고 찾기
	 * (예를 들어 어른용이라고 검색하면 어른용 장난감이 출력됨) 
	 */
	
	public List<Toy> searchType(ToySpec searchSpec) {
		List<Toy> temp = new ArrayList<Toy>();
		Enumeration<Toy> e = toys.elements();
		while (e.hasMoreElements()) {
			Toy toy = (Toy) e.nextElement();
			ToySpec spec = toy.getSpec();
			if (spec.equals(searchSpec)) {
				temp.add(toy);
			}
		}
		return temp;
	}
	
	/**
	 * 모든 등록된 장난감 출력
	 */
	public List<Toy> getAll(){
		return toys;
	}
	
}
