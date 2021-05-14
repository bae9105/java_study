package A8958;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class A8958 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = sc.nextInt();
        String[] inBox = new String[cnt];
        int score = 0;
        int scoreSum = 0;
        for(int i = 0;i<cnt;i++){
            inBox[i] = sc.next();
            score = 0;
            scoreSum = 0;
            for(int j = 0;j<inBox[i].length();j++){
                char g = inBox[i].charAt(j);
                if('O'==g){
                    score ++;
                    scoreSum += score;
                }else{
                    score = 0;
                }
            }
            bw.write(scoreSum+"\n");
        }
        bw.flush();
        bw.close();
        sc.close();

    }
}
