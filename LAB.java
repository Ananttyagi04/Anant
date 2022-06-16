//WAP to perform operators with the help of function
	import java.util.*;
	public class LAB {
	    public static void main(String[] args) {
	        accept();
	    }
	    public static void accept() {
	        int num1,num2;
	        Scanner ch=new Scanner(System.in);
	        System.out.println("Enter two number ");
	        num1 = ch.nextInt();
	        num2 = ch.nextInt();
	        System.out.println("The Arthmetic Operators");
	        arth(num1,num2);
	        System.out.println("The Assignment Operators");
	        assign(num1,num2);
	        System.out.println("The bitwise Operators");
	        bitwise(num1,num2);
	        System.out.println("The relational Operators");
	        rel(num1,num2);
	        System.out.println("The logical Operators");
	        logical(num1,num2);
	        System.out.println("The ternory Operators");
	        ternory(num1,num2);

	    }
	    public static void arth(int x,int y) {
	        System.out.println("The add of two value "+(x+y));
	        System.out.println("The sub. of two value "+(x-y));
	        System.out.println("The mul. of two value "+(x*y));
	        System.out.println("The div. of two value "+(x/y));
	        System.out.println("The mod. of two value "+(x%y));
	       
	    }
	    public static void assign(int x,int y) {
	        System.out.println("The add assign of two value "+(x+=y));
	        System.out.println("The sub. assign of two value "+(x-=y));
	        System.out.println("The mul. assign of two value "+(x*=y));
	        System.out.println("The div. assign of two value "+(x/=y));
	        System.out.println("The mod. assign of two value "+(x%=y));
	       
	    }
	    public static void bitwise(int x,int y) {
	        System.out.println("The AND bitwise operator "+(x&y));
	        System.out.println("The OR bitwise operator "+(x|y));
	        System.out.println("The XOR bitwise operator "+(x^y));
	       
	    }
	    public static void rel(int x,int y) {
	        System.out.println("The add relation of two value "+(x<y));
	        System.out.println("The sub. relation of two value "+(x>y));
	        System.out.println("The mul. relation of two value "+(x>=y));
	        System.out.println("The div. relation of two value "+(x<=y));
	        System.out.println("The mod. relation of two value "+(x==y));
	        System.out.println("The mod. relation of two value "+(x!=y));
	       
	    }
	    public static void logical(int x,int y) {
	        System.out.println("The AND Logical operator "+(x>59&&y<40));
	        System.out.println("The OR Logical operator "+(x>10||y>15));
	        // System.out.println("The NOT Logical operator "+(x!y));
	       
	    }
	    public static void ternory(int x,int y) {
	        System.out.println("The Ternory operator "+((x>y)?x:y));
	       
	    }
	    
	}
