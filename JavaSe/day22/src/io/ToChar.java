package io;

import java.util.TreeMap;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ToChar {
	public static void main(String[] args) {
		
		charCount("13913535174");
		
	}
	public static String charCount(String s){
		char[] ch=s.toCharArray();
		TreeMap<Character,Integer> tm =new TreeMap<Character,Integer>();
		int max =0;
		int i;
		Integer value = null;
		for( i=0;i<s.length();i++){
			value =tm.get(ch[i]);
			if(value==null){
				tm.put(ch[i],1);
			}else{
				value = value+1;
				tm.put(ch[i], value);
			}
		}
		System.out.println(tm);
		
		return null;
	}
}
