import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
    int a,b,c;
    System.out.print("Enter any Two Number");
    Scanner s=new Scanner(System.in);
    
    a=s.nextInt();
    b=s.nextInt();
    
    c=a+b;
    System.out.print("Sum of Two Number: "+c);
	}

}