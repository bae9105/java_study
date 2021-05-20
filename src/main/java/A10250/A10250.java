/*package A10250;

import java.io.*;
import java.util.StringTokenizer;

public class A10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0;i<cnt;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int a = n%h;
            if(n%h==0){
                a = h;
            }
            int b = (int)Math.ceil((double)n/(double)h);
            if(b<10){
                bw.write(a+"0"+b+"\n");
            }else{
                bw.write(a+""+b+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}*/


package A10250;

import java.io.*;
import java.util.StringTokenizer;

public class A10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0;i<cnt;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int a = n%h;
            int b = (n/h);
            if(n%h==0){
                bw.write(h*100+b+"\n");
            }else{
                bw.write(a*100+b+1+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}