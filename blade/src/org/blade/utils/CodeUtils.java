package org.blade.utils;

import java.util.UUID;

public class CodeUtils {

	public static String generateUUID(){
		
		UUID uuid  = UUID.randomUUID();
		return uuid.toString();
	}
	
	public static void main(String[] args) {
		int i = 0 ;
		long start = System.currentTimeMillis();
		while(i < 10000000){
			CodeUtils.generateUUID();
			//System.out.println(CodeUtils.generateUUID());
			i++;
		}
		System.out.println(System.currentTimeMillis()-start);
	}
}
