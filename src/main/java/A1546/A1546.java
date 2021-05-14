package A1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        double[] inBox = new double[cnt];
        double max = 0;
        double sumScore = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<cnt;i++){
            inBox[i] =Integer.parseInt(st.nextToken());
            if(inBox[i]>max){
                max =inBox[i];
            }
        }
        for(int i = 0;i<cnt;i++){
            sumScore += inBox[i]/max*100;
        }
        System.out.println(sumScore/cnt);
    }
}
