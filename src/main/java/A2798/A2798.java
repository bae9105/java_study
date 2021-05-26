package A2798;

import java.io.*;
import java.util.*;

public class A2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st1.nextToken());
        int number = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] card = new int[cnt];
        int a = 0;
        int b = number;
        int output=0;
        while(st2.hasMoreTokens()){
            card[a] = Integer.parseInt(st2.nextToken());
            a++;
        }
        for(int i=0;i<cnt;i++){
            for(int j=i+1;j<cnt;j++){
                for(int k=j+1;k<cnt;k++){
                    int sum = number-(card[i]+card[j]+card[k]);
                    if(sum>=0 && sum<b){
                        b =sum;
                        output = card[i]+card[j]+card[k];
                    }
                }
            }
        }
        System.out.println(output);
        br.close();
    }
}
