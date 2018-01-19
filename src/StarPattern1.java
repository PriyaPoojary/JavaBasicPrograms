import java.util.Scanner;

public class StarPattern1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("How many rows do you want in your Pattern?");
        int totalRows = sc.nextInt();
        
        for (int i=1; i<=totalRows; i++)
        {
        	for(int j=1; j<=i; j++){
        		System.out.print("* ");
        	}
            System.out.println();
        }
        sc.close();
	}
}