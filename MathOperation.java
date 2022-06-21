/*31.	Create a class MathOperation with two data member X and Y to store the operand 
   and third data member R to store result of operation.
   Create method members
	init - to input X and Y from user
	add - to add X and Y and store in R
	multiply - to multiply X and Y and store in R
	power - to calculate X Y and store in R
	display- to display Result R  */

package assi3;
import java.util.Scanner;

public class MathOperation {
	private int X, Y;
	private double R;
	Scanner s = new Scanner(System.in);
	
	public void init()
	{
		System.out.println("Enter two numbers : ");
		X = s.nextInt();
		Y = s.nextInt();
	}
	
	public double add()
	{
		R = X + Y;
		System.out.print("Addtion ");
		return R;
	}
	
	public double multiply()
	{
		R = X * Y;
		System.out.print("Multiplication ");
		return R;
	}
	
	public double power()
	{
		R = Math.pow(X, Y);
		System.out.print("Power ");
		return R;
	}
	
	public void display()
	{
		System.out.println("Result = "+R);
	}
	
	public void percentage()
	{
		R = X + Y / 200 * 100;
		System.out.println("Percentage ");
		return R;
	}

	public static void main(String[] args){
		MathOperation a = new MathOperation();
		a.init();
		a.add();
		a.display();
		a.multiply();
		a.display();
		a.power();
		a.display();
	}
}

/*
Enter two numbers : 
5
4
Addtion Result = 9.0
Multiplication Result = 20.0
Power Result = 625.0 */