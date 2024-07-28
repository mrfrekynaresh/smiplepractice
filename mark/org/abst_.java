package mark.org;
import java.util.Scanner;
 abstract class shape{
	 
abstract void area();
}
 class triangle extends shape{
	 void area() {
		
		 Scanner k2 = new Scanner (System.in);
		 System.out.print("enter your triangle size");
		 int si = k2.nextInt();		 
				 System.out.println("enna da panra ......"+si);
				 k2.close();
	 }
 }
 class square extends shape{
	 void area() {
		 System.out.println("what your name");
	 }
 }

public class abst_ {

	public static void main(String[] args) {
		
		shape [] m = new shape [2];
		m[0]= new triangle();
		m[1]= new square ();
		for(shape m1 : m) {
			m1.area();
		}
		
	}

}
