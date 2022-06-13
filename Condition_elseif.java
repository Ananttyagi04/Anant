import java.util.Scanner;

public class Condition_elseif {

	public static void main(String[] args) {
	
		
		int marks;
		System.out.print("Enter Marks");
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		if(marks>60 && marks<100)
		{
			System.out.print("First division");
		}
		else if(marks>33 && marks<60)
		{
			System.out.print("Second division");
		}
		else if(marks>45 && marks<55)
		{
			System.out.print("Third division");
		}
		else
		{
			System.out.print("Failed");
		}
	}

}
