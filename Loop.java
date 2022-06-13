import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		
		int num;
		System.out.print("Enter any Number");
		Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        
        for(int i=1;i<11;i++)
        {	
        	System.out.println(num*i);
        }
	}

}
