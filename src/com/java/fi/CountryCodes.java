package com.java.fi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CountryCodes {
	
	
	public static void main(String args[]) {
		
		
		Map<Integer, String> countryCode= new HashMap<Integer, String>();	countryCode.put(1, "US");
		countryCode.put(91, "INDIA");
		countryCode.put(65, "SINGAPORE");
		countryCode.put(62, "MALAYSIA");
		
		System.out.println(countryCode);
		
		countryCode=sortbyValues(countryCode);
		
		System.out.println(countryCode);
		 
	
	}
	 // Function to sort map by Key
    public static Map<Integer, String> sortbyValues(Map<Integer, String> countryCode)
    {
        ArrayList<String> sortedValues
            = new ArrayList<String>(countryCode.values());
 
        Collections.sort(sortedValues, (s1,s2)-> s1.compareTo(s2));
         
        System.out.println(sortedValues);
 
        Map<Integer, String> sortedMap= new LinkedHashMap<Integer, String>();
        
        for (String x : sortedValues)
        {
        	for(Entry<Integer, String> entry :countryCode.entrySet()) {
        		if(entry.getValue().equalsIgnoreCase(x)) {
        			sortedMap.put(entry.getKey(), entry.getValue());	
        		}
        	}
        }
        System.out.println(sortedMap);
        return sortedMap;
    }
	
}
