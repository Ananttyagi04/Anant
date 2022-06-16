
public class fabinnoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n = 8, FirstTerm = 0, SecondTerm = 1;
	System.out.println("Fibonacci series till " + n +" terms:");
	
	for(int i = 1;i<=n; ++i);
	System.out.print(FirstTerm + ", ");
	
	// compute the next term
	int Main = FirstTerm + SecondTerm;
	FirstTerm = SecondTerm;
	SecondTerm = FirstTerm;
		
	}

}
