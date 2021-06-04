package A2751;

import java.io.*;
import java.util.Arrays;

public class A2751 {
    //퀵정렬안됨
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] box = new int[n];
        for(int i = 0;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            box[i]=x;
        }
        Arrays.sort(box);
        for(int i : box){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}
