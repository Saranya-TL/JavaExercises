package assignmentsMap.ex_642024.java;

import java.util.*;

public class MapIteration {
	
	public static void main (String[] args) {
		
		Map<String, String> mapIteration = new HashMap<>();
		mapIteration.put("Name", "Saranya");
		mapIteration.put("Id", "1031");
		mapIteration.put("Course", "Java");
		
		for(Map.Entry<String,String> map : mapIteration.entrySet()){
			System.out.println(map.getKey()+":" + map.getValue());
		}
		System.out.println(mapIteration);
		
		
	
	}
}
