import java.util.*;
 
public class FibonacciSeries{
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        
        System.out.println("How many elements you want to print in Fibonacci series");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        System.out.println("Fibonacci series");
        System.out.print(first +" "+ second);
        int next;
        for(int i = 2; i < n; i++){
            next = first + second;
            System.out.print(" "+ next);
            
            first = second;
            second = next;
        }
        in.close();
    }
}