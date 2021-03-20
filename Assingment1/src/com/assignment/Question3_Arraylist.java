package com.assignment;
//Program for Question 3


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class Question3_Arraylist {
	public static void func(String[] name) {
		ArrayList<String> str=new ArrayList<String>(Arrays.asList(name));
		LinkedHashSet<String> unique = new LinkedHashSet(str);
		System.out.println(unique);
	}
	public static void main(String[] args) {

		String name[]= {"Spk","Cts", "Chennai","Sholinganallur","Spk"};
		func(name);
		
	}
	
}
