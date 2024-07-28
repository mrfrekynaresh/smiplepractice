package mark.org;

import java.util.Scanner;

public class newMark {    
	public static void main(String[]args) {
		int a;
		Scanner group=new Scanner(System.in);
		System.out.println("enter your mark");
		a=group.nextInt();
		group.close();       
		
		if(a>=90)
			System.out.println(a+" percentage of declare for A grade");
		else if(a>=80)
			System.out.println(a+" percentage of declare for B grade");
		else if(a>=70)
			System.out.println(a+" percentage of declare for C grade");
	else if(a>=60)
			System.out.println(a+" percentage of declare for D grade");
		else 
			System.out.println(a+" percentage of declare for E grade");
		
		
			
		}
		}
		

	
	


