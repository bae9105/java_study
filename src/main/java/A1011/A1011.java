package A1011;

import java.util.Scanner;

public class A1011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int cnt = sc.nextInt();
        int moveCnt=0;
        for(int i = 0;i<cnt;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dis = y - x;
            int max = (int)Math.sqrt(dis);
            if(max == Math.sqrt(dis)){
                moveCnt= max*2-1;
            }else if(dis <= max*max+max){
                moveCnt=max*2;
            }else{
                moveCnt=max*2+1;
            }
            sb.append(moveCnt).append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}
