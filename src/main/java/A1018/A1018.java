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

        int min = 64;
        char black = 'B';
        char white = 'W';
        char change;
        for(int i = 0;i<=ver-8;i++){
            for(int j = 0;j<=hor-8;j++){
                int bStart=0;
                int wStart=0;
                for(int k = i;k<i+8;k++){
                    for(int l = j;l<j+8;l++){
                        if(box[k].charAt(l)!=black){
                            bStart++;
                        }
                        if(box[k].charAt(l)!=white){
                            wStart++;
                        }
                        change = black;
                        black = white;
                        white = change;
                    }
                    change = black;
                    black = white;
                    white = change;
                }
                if(bStart<min){
                    min = bStart;
                }
                if(wStart<min){
                    min = wStart;
                }
            }
        }
        System.out.println(min);
    }
}
