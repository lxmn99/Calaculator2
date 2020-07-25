package co.epam.Calaculator;
import java.io.IOException;
import java.util.Scanner;
public class Cal {
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void sub(int a,int b) {
		System.out.println(a-b);
	}
	public static void mult(int a,int b) {
		System.out.println(a*b);
	}
	public static void div(int a,int b) {
		System.out.println(a/b);
	}
	public static void main(String args[])throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your operartion:\n1.Add 2.sub 3.Mult 4.Div");
		int n=sc.nextInt();
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(n) {
		case 1:
			add(a,b);
			break;
		case 2:
			sub(a,b);
			break;
		case 3:
			mult(a,b);
			break;
		case 4:
			div(a,b);
			break;
		default:
			System.out.println("Enter a valid operation");
			break;
		}
		sc.close();
	}

}
