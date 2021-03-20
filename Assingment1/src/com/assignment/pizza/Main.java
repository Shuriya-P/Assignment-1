package com.assignment.pizza;
import java.util.*;
//Question Number 5 and 6 combined
public class Main {
	public static int fetchCalories(int piz) {
		int cal;
		if(piz==1) {
			MargheritaPizza m=new MargheritaPizza();
			cal=m.makePizza();
			return cal;
			}
			else if(piz==2) {
			CheesePizza c=new CheesePizza();
			cal=c.makePizza();
			return cal;
			}
			else {
				System.out.println("Invalid Choice");
				return 0;
			}
	}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the pizza:\n1.Margherita Pizza\n2.Cheese Pizza");
		int piz=sc.nextInt();
		Main m=new Main();
		int cal=m.fetchCalories(piz);
		Nutritionist n=new Nutritionist();
		n.printCalories(cal);
		
		

	}
}
