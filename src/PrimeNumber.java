public class PrimeNumber{
    public static void main(String[] args) {
        int i, j, flag;
        System.out.println("Prime Numbers Between 1 to 100:");
 
        for (i = 2; i <= 100; i++) {
            flag = 0;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println(i);
        }
    }
}