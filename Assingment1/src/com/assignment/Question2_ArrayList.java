package com.assignment;
//Program for Question 2


import java.util.ArrayList;
import java.util.Arrays;
public class Question2_ArrayList {
	public static void func(String[] name) {
		ArrayList<String> str=new ArrayList<String>(Arrays.asList(name));
		System.out.println(str);
	}
	public static void main(String[] args) {

		String name[]= {"Spk","Cts", "Chennai","Sholinganallur"};
		func(name);
		
	}
	
}