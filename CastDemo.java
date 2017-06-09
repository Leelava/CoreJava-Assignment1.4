//Pprogram in java to implement type casting between different variables.

package Session1Assignment4;

import java.util.Scanner;

public class CastDemo {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input the byte sized number");
		byte b = input.nextByte();
		System.out.println("Byte sized number is " +b);
		
		System.out.println("Input the short type integer");
		short s = input.nextShort();
		System.out.println("Short integer is " +s);
		
		//int,long, float, double type variables
		int i; long l; float f; double d;
		i = b +s;
		System.out.println("The sum of byte and short numbers is " +b+ "+" +s+ "=" +i);
		
		l = s + i;
		System.out.println("The sum of short and int type numbers is " + s + "+" +i+ "=" +l);
		
		f = l + i;
		System.out.println("The sum of int and long type numbers is " +l+ "+"+i+ "=" +f);
		
		d = f + l;
		System.out.println("The sum of float and long type number is" +f+ "+" +l+ "=" +d);
		
	}

}
