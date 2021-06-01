/*
package A1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int input = Integer.parseInt(br.readLine());
        for(int i = 0;i<input;i++){
            zero = 0;
            one = 0;
            int n = Integer.parseInt(br.readLine());
            fib(n);
            sb.append(zero+" "+one+"\n");
        }
        System.out.println(sb);
    }
    static int zero;
    static int one;
    public static int fib(int n){
        if(n==0){
            zero++;
            return 0;
        }else if(n==1){
            one++;
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
}
*/
/*package A1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int input = Integer.parseInt(br.readLine());
        int[][] box = new int[41][2];
        box[0][0] = 1;
        box[0][1] = 0;
        box[1][0] = 0;
        box[1][1] = 1;
        for(int i = 2;i<41;i++){
            box[i][0] = box[i-1][0]+box[i-2][0];
            box[i][1] = box[i-1][1]+box[i-2][1];
        }
        for(int i = 0;i<input;i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(box[n][0]+" "+box[n][1]+"\n");
        }
        System.out.println(sb);
    }
}*/

package A1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1003 {
    static Integer[][] box;
    public static Integer[] fb(int n){
/*        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fb(n-1) + fb(n-2);
        }*/
        if(box[n][0]==null && box[n][1] ==null){
            box[n][0]=fb(n-1)[0]+fb(n-2)[0];
            box[n][1]=fb(n-1)[1]+fb(n-2)[1];
        }
        return box[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int input = Integer.parseInt(br.readLine());
        box = new Integer[41][2];
        box[0][0] = 1;
        box[0][1] = 0;
        box[1][0] = 0;
        box[1][1] = 1;
        for(int i = 0;i<input;i++){
            int n = Integer.parseInt(br.readLine());
            fb(n);
            sb.append(box[n][0]+" "+box[n][1]+"\n");
        }
        System.out.println(sb);
    }
}