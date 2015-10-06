package com.fetchurtunes.BAL;

import java.security.MessageDigest;

public class hasher { // hasher class (key-value map)
	public String toSha256(String ipString) throws Exception { // method takes String(URL) and returns String(key)
		MessageDigest md = MessageDigest.getInstance("SHA-256"); // instantiated with "SHA-256" algorithm
		String key = ipString.toLowerCase();
		md.update(key.getBytes("ASCII"));
		byte[] hash = md.digest();
		StringBuilder strbuild = new StringBuilder();
		
		for (byte b : hash)
			strbuild.append(String.format("%02x", b));
		
		return strbuild.toString().toUpperCase();
	}
}
