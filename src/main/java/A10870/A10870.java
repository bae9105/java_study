package A10870;

import java.util.Scanner;

public class A10870 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(fb(input));
        sc.close();
    }
    public static int fb(int i){
        if(i <= 1){
            return i;
        }else{
            return fb(i-1)+fb(i-2);
        }

    }
}
