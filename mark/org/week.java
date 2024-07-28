package mark.org;
import java.util.Scanner;

public class week {
	public static void main(String[]args) {
		int a;
		Scanner enter = new Scanner(System.in);
		System.out.println("enter a number in 1 to 7");
		a=enter.nextInt();
		
		if(a==1)
			System.out.println("sunday");
		else if(a==2)
			System.out.println("monday");
		else if(a==3)
			System.out.println("tuesday");
		else if(a==4)
			System.out.println("wednesday");
		else if(a==5)
			System.out.println("thursday");
		else if(a==6)
			System.out.println("firday");
		else
			System.out.println("saturday");
			
enter.close();
}
}