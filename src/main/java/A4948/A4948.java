package A4948;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class A4948 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            int input = sc.nextInt();
            int priNum = 0;
            if(input==0){
                break;
            }
            for(int i = input;i<=input*2;i++){
                int cnt = 0;
                for(int j = 2;j<=i;j++){
                    if(i%j==0){
                        cnt++;
                    }
                    if(cnt==2){
                        break;
                    }
                }
                if(cnt==1){
                    priNum +=1;
                }
            }
            bw.write(priNum+"\n");
        }
        bw.flush();
        bw.close();
        sc.close();
    }
}
