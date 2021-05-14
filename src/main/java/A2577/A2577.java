package A2577;

import java.util.Scanner;

public class A2577 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tot = sc.nextInt()*sc.nextInt()*sc.nextInt();
        String[] d = Integer.toString(tot).split("");
        for(int i=0;i<10;i++){
            int cnt = 0;
            for(int j=0;j<d.length;j++){
                if(i==Integer.parseInt(d[j])){
                    cnt +=1;
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
