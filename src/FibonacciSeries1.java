import java.util.*;
public class FibonacciSeries1 {
    public static void main(String[] args) {
        
        int first = 0;
        int second = 1;
                
        System.out.println("How many elements you want to print in a Fibonacci series");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        System.out.println("Fibonacci series");
        System.out.print(first+ " "+second);
        
        int next,i = 2;
        while(i<n) {
            next = first + second;
            System.out.print(" " +next);
            
            first = second;
            second = next;
            i++;
        }
        in.close();
    }
}    