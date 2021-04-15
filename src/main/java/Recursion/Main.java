package Recursion;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        System.out.println("1부터 " + num + "까지 합 = " + numsum(num) );
        System.out.println(num + "! = " + factorial(num));
        sc.close();
    }
    public static int numsum(int num)
    {
        if(num == 1)
        {
            return 1;
        }
        else
        {
            return num + numsum(num -1);
        }
    }
    public static int factorial(int num){
        if(num==1){
            return num;
        }else{
            return num*factorial(num -1);
        }
    }
}
