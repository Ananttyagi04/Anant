import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int a,b,c,ch;
		System .out.print("Enter any Two Number: ");
		Scanner s=new Scanner(System.in);
		
		a=s.nextInt();
		b=s.nextInt();
		System.out.print("Enter Your Choice ");
		ch=s.nextInt();
		
		
		switch(ch)
		{
		    case 1:c=a+b;
		        System.out.print("Addition "+c);
		        break;
		    case 2:c=a-b;
	            System.out.print("Subtraction "+c);
	             break;
		    case 3:c=a*b;
	            System.out.print("Multiply "+c);
	             break;
		    case 4:c=a/b;
	            System.out.print("Division "+c);
	             break;
		    case 5:c=a%b;
	            System.out.print("Rimender "+c);
	             break;
	        default:
	        	System.out.print("Invalid Choice...");
	        
		
		}

	}

}
