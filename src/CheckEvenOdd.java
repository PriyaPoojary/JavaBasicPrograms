import java.util.*;

public class CheckEvenOdd{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is Even or Odd:");
		n = sc.nextInt();
		
		if(n > 100){
			System.out.println("Please enter a number less than 100.");
		}
		else	
		{
			
			if(n % 2 == 0)
			{
				System.out.println(n+ " is a even number."); 
			}
			else
			{
				System.out.println(n+ " is a odd number."); 
			}
		}
		sc.close();
	}
}