package A2562;

import java.util.Scanner;

public class A2562 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] inBox = new int[9];
        int max = 0,maxIdx = 0,idx=0 ;
        for(int i = 0;i<9;i++){
            int input = sc.nextInt();
            inBox[i] = input;
        }
        for(int i=0;i<9;i++){
            if(inBox[i]>max){
                max = inBox[i];
                maxIdx =i+1;
            }
        }
        System.out.println(max);
        System.out.println(maxIdx);

    }
}
