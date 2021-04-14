package Recursion;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        System.out.println("1부터 " + num + "까지 합 = " + numsum(num) );
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
}
