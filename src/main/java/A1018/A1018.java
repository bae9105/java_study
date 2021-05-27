package A1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ver = Integer.parseInt(st.nextToken());
        int hor = Integer.parseInt(st.nextToken());
        String[] box = new String[ver];
        for(int i = 0;i<ver;i++){
            box[i] = br.readLine();
        }

        int bStart=0;
        int wStart=0;
        for(int j = 0;j<=ver-8;j++){
            for(int i = 0;i<=hor-8;i++){
                
            }
        }
    }
}
