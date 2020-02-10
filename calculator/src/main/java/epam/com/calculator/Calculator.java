package epam.com.calculator;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two numbers");
		float num1=in.nextFloat();
		float num2=in.nextFloat();
		System.out.print("Enter an option\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
		int op=in.nextInt();
		while(op<1 || op>4){
			System.out.println("Enter a valid option ranging from 1-4");
			op=in.nextInt();
		}
		if(op==1) {
			Addition obj=new Addition(num1,num2);
			System.out.println("Addition of given Numbers is : "+obj.add());
		}
		else if(op==2) {
			Subtraction obj=new Subtraction(num1,num2);
			System.out.println("Subtraction of given Numbers is : "+obj.sub());
		}
		else if(op==3) {
			Multiplication obj=new Multiplication(num1,num2);
			System.out.println("Multiplication of given Numbers is : "+obj.mul());
		}
		else{
			Division obj=new Division(num1,num2);
			System.out.println("Division of given Numbers is : "+obj.div());
		}
		in.close();
	}

}
