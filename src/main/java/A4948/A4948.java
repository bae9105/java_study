package A4948;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class A4948 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] box = new boolean[123456*2+1];
        Arrays.fill(box, true);
        box[0] = false;
        box[1] = false;
        for(int i = 2;i<=Math.sqrt(123456*2);i++){
            if(box[i]==false){
                continue;
            }
            for(int j = i*i;j<=box.length-1;j+=i){
                box[j] = false;
            }
        }
        while(true){
            int input = sc.nextInt();
            int cnt = 0;
            if(input == 0){
                break;
            }
            for(int i = input+1;i<=input*2;i++){
                if(box[i]==true){
                    cnt++;
                }
            }
            bw.write(cnt+"\n");
        }
        bw.flush();
        bw.close();
        sc.close();
    }
}
