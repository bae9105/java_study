package A10872_2;

import java.util.*;

public class A10872_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(fac(input));

    }
    public static int fac(int n){
        if(n<=1){
            return 1;
        }else{
            return fac(n-1)*n;
        }
    }
}
