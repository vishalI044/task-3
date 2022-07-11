package com;

import java.util.Hashtable;
import java.util.Map;

import org.json.simple.JSONObject;

public class getEmployeeDeatils {
	public JSONObject getDetails(int empCode){
		JSONObject jo1 = new JSONObject();
	Hashtable<Integer, LoginUserData> ht = new Hashtable<>();

	LoginUserData lud = new LoginUserData(101, "sathish", 20000);
	LoginUserData lud1 = new LoginUserData(102, "aiswarya", 20000);
	LoginUserData lud2 = new LoginUserData(103, "boopathi", 20000);
	LoginUserData lud3 = new LoginUserData(104, "vinitha", 20000);
	LoginUserData lud4 = new LoginUserData(105, "vishal", 20000);

	ht.put(101, lud);
	ht.put(102, lud1);
	ht.put(103, lud2);
	ht.put(104, lud3);
	ht.put(105, lud4);
	// System.out.println(ht);
	
	for (Map.Entry<Integer, LoginUserData> entry : ht.entrySet()) {

		int key = entry.getKey();
		// System.out.println("checking 3 "+key);
		if (key == empCode) {
			// System.out.println("checking 4 "+empCode);
			LoginUserData login = ht.get(empCode);
			
			jo1.put("name", login.name);
			jo1.put("empCode", login.empCode);
			jo1.put("salary", login.salary);

			System.out.println(jo1);
			
		}
	}
	return jo1;
	}
}
