package A10870_2;

import java.util.*;

public class A10870_2 {
    public static int fib(int n){
        if(n<=0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(fib(input));
        sc.close();
    }
}
