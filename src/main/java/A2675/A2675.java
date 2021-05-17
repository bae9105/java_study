package A2675;

import java.io.*;
import java.util.StringTokenizer;

public class A2675 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);
        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0;i<cnt;i++){
            String outTxt ="";
            StringTokenizer st = new StringTokenizer(br.readLine());
            int reCnt = Integer.parseInt(st.nextToken());
            String[] txt = st.nextToken().split("");
            for(String j : txt){
                for(int k=0;k<reCnt;k++){
                    outTxt = outTxt.concat(j);
                }
            }
            bw.write(outTxt+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
