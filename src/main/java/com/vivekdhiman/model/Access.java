package com.vivekdhiman.model;

import java.util.HashMap;
import java.util.Map;

public class Access {
	
	 public static String email;
	 public static String password;
	 
	 
	 
	@Override
	public String toString() {
		return "Access [email=" + email + ", password=" + password + "]";
	}
	public Access() {
		super();
		this.email = email;
		this.password = password;
		
	}
	
	public static Map<String, Object> toMap(){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("email", email);
		map.put("password", password);
		
		return map;
		
	}
	

}
