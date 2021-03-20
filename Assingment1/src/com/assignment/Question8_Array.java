package com.assignment;
import java.util.*;
public class Question8_Array {

	public static void main(String[] args) {
		String names[][]=new String[2][3];
		System.out.println("Enter the Elements");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
			for(int j=0;j<3;j++) {
				names[i][j]=sc.nextLine();
				if(names[i][j]=="") {
					System.out.println("This String cannot hold null values");
					System.exit(0);
				}
			}
	}

}
