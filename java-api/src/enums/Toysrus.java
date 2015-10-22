package enums;

import java.util.List;
import java.util.Scanner;

public class Toysrus {
/**
 * 장난감이 입고되었을 때, 점원이 바코드번호롤 등록을 하는 과정
 * 1. setBarcode() : 12346
 * 2. setName() : 상품명 등록(Enum에 있는 이름)
 * 3. setUser() : 어른용, 어린이용
 * 4. setType() : 피규어, 인형
 */
 public static void main(String[] args) {
	 
	 ToyRegister tr = new ToyRegister();
	 ToySpec spec = new ToySpec();
	 spec.setMap("사용자",ToyUser.어른용);
	 spec.setMap("타입", ToyType.피규어);
	 tr.regist("스파이더맨", 5000, spec);
	 //등록된 모든 장난감 출력
	 List<Toy> list = tr.getAll();
	 for (Toy toy : list) {
		System.out.println(toy);
	}
	 // 이름으로 조회
	 tr.searchName("스파이더맨");
	}
}
