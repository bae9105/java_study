package A2839;

import java.util.Scanner;

public class A2839 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int cnt = 0;
        int min = input/3;
        boolean chk = false;
        for(int i = 0; i<=input/3;i++){
            int a = input-(i*3);
            if(a%5==0){
                chk = true;
                cnt = (a/5)+i;
                if(cnt<min){
                    min = cnt;
                }
            }
        }
        if(chk==true){
            System.out.println(min);
        }else{
            System.out.println("-1");
        }
    }
}
