package A2292;

import java.util.Scanner;

public class A2292 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int cnt = 1;
        int sum = 0;
        while(input>sum+1){
            sum += (6*cnt);//방의 갯수가 1 6 18.. 씩 증가한다
            cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}
