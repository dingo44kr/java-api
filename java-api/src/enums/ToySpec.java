package enums;

import java.util.HashMap;
import java.util.Map;

public class ToySpec {
	private Map<String, Object> map;

	public ToySpec() { // ToySpec의 생성자를 사용해야만 존재함
		map = new HashMap<String, Object>();
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	// 맵에 키, 속성 추가
	public void setMap(String key, Object val) { // 오버로딩 (중복정의)
		map.put(key, val);
	}

	// 키값에 따라서 속성 가져오기
	public Object getMap(String key) {
		return map.get(key);
	}

	
	// 스펙 비교검색 (내부의 스펙만)
	public boolean match(ToySpec spec) {
		boolean boo = false;
		String dest = "", target = ""; // dest : 비교대상, target : 비교당하는 객체
		if (spec.getMap("ToyUser") != null) {
			dest += spec.getMap("ToyUser");
			target += this.getMap("ToyUser");
		}
		if (spec.getMap("ToyType") != null) {
			dest += spec.getMap("ToyTser");
			target += this.getMap("Toytype");
		}
		return spec.equals(target);
		
	}
	@Override
	public boolean equals(Object obj){
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
