package A2775;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class A2775 {
    public static void main(String[] args) throws IOException {
        int[][] apt = new int[15][15];
        for(int i = 0;i<15;i++){
            apt[0][i] = i;
            apt[i][1] = 1;
        }
        for(int i = 1;i<15;i++){
            for(int j = 2;j<15;j++){
                apt[i][j] = apt[i][j-1]+apt[i-1][j];
            }
        }
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = sc.nextInt();
        for(int i=0;i<cnt;i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            bw.write(apt[k][n]+"\n");
        }
        bw.flush();
        bw.close();
        sc.close();
    }
}
