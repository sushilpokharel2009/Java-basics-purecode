package com.stosh;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D {

	public static void main(String[] args) {
		
		Map<String, String> m = new HashMap();
		m.put("c2", "Ram");
		m.put("a1", "Hari");
		m.put("b", "Sita");
		m.put("d", "Arjun");
		
		System.out.println(m.get("d"));

		Set<String> key = m.keySet();
		
		for(String k:key){
			System.out.println(k+"-----"+m.get(k));
		}
		
	}

}
