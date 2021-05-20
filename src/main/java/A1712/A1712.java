package A1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int fix = Integer.parseInt(st.nextToken());
        int var = Integer.parseInt(st.nextToken());
        int note = Integer.parseInt(st.nextToken());
        int cnt = 0;
        if(var<note){
            cnt = fix/(note-var);
            cnt++;
        }else{
            cnt = -1;
        }
        System.out.println(cnt);
    }
}
