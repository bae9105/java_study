package A1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean[] box = new boolean[b+1];
        for(int i = 0;i<box.length;i++){
            if(i==0 || i==1){
                box[i] = false;
            }else{
                box[i] =true;
            }
        }
        for(int i = 2;i <= Math.sqrt(b);i++){
            if(box[i]==false){
                continue;
            }for(int j=i*i;j<box.length;j=j+i){
                box[j]=false;
            }
        }
        for(int i = a; i<box.length;i++){
            if(box[i]==true){
                System.out.println(i);
            }
        }
    }
}
