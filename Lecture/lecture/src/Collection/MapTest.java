package Collection;

import java.util.HashMap;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(20401, "김영호");
		hMap.put(20402, "김지효");
		hMap.put(20403, "박민규");
		hMap.put(20404, "신권호");
		hMap.put(20405, "신민석");
		hMap.put(20406, "윤지상");
		
		System.out.println("해쉬맵 출력");
		System.out.println(hMap);
		
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.putAll(hMap);
		
		System.out.println("트리맵 출력");
		System.out.println(tMap);
	}

}
