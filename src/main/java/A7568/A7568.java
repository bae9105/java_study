package A7568;

import java.io.*;
import java.util.*;

public class A7568 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        int[][] box = new int[cnt][2];

        for(int i = 0;i<cnt;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            box[i][0] = Integer.parseInt(st.nextToken());
            box[i][1] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0;i<cnt;i++){
            int rank = 1;
            for(int j = 0;j<cnt;j++){
                if(i==j){
                    continue;
                }
                if(box[i][0]<box[j][0] && box[i][1]<box[j][1]){
                    rank ++;
                }
            }
            bw.write(rank+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
