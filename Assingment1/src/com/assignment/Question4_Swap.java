package com.assignment;
import java.util.*;
public class Question4_Swap {

	    public ArrayList switchIt(ArrayList aOne, int a, int b){
	        int temp = (int) aOne.get(a);
	        aOne.set(a, aOne.get(b));
	        aOne.set(b, temp);
	        return aOne;
	    }
	    public static void main(String[] args) {
	    	Question4_Swap s = new Question4_Swap();
	        ArrayList<Integer> arr = new ArrayList<Integer>(4);
	        arr.add(10);
	        arr.add(20);
	        
	        ArrayList<Integer> arr1 = s.switchIt(arr,0,1);
	        for(int i: arr1){
	            System.out.println(i);
	        }
	    }
	
}