package A4344;

import java.io.*;
import java.util.StringTokenizer;

public class A4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseCnt = Integer.parseInt(br.readLine());
        for(int i=0;i<caseCnt;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tot = Integer.parseInt(st.nextToken());
            int[] scoreBox = new int[tot];
            int score;
            int totScore = 0;
            for(int j=0;j<tot;j++){
                score = Integer.parseInt(st.nextToken());
                scoreBox[j]= score;
                totScore += score;
            }
            int avg = totScore/tot;
            int avgUp=0;
            for(int k:scoreBox){
                if(k>avg){
                    avgUp++;
                }
            }
            double last = (double)avgUp/tot*100;
            bw.write(String.format("%.3f",last)+"%\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
