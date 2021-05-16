package A1065;

import java.util.Scanner;

public class A1065 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int cnt =0;
        for(int i = 1;i<=input;i++){
            if(sameNum(i)){//해당값이 true면 카운트를 센다
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();

    }
    public static boolean sameNum(int input){
        boolean x = true;
        if(input>=100){//99이하인 자연수는 각 자리수가 등차수열이다
            String[] y = Integer.toString(input).split("");//각 자리수 구한다 ++각 자리수를 나머지를 통해 구해도 됨++
            int a = Integer.parseInt(y[0]);
            int b = Integer.parseInt(y[1]);
            int c = Integer.parseInt(y[2]);
            if(b!=(double)(a+c)/2){//등차수열 공식에 적용한다
                x = false;
            }
        }
        return x;
    }
}
