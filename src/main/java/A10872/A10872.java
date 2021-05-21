package A10872;

import java.util.Scanner;

public class A10872 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(pac(input));

    }
    public static int pac(int a){
        if(a<=1){
            return 1;
        }else{
            return pac(a-1)*a;
        }

    }
}

