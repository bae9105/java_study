/*
package A2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int aa = (a%10*100)+((a/10)%10*10)+((a/100));
        int bb = (b%10*100)+((b/10)%10*10)+((b/100));
        if(aa>bb){
            System.out.println(aa);
        }else{
            System.out.println(bb);
        }
    }
}
*/

package A2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt((new StringBuilder(st.nextToken())).reverse().toString());
        int b = Integer.parseInt((new StringBuilder(st.nextToken())).reverse().toString());
        System.out.println(a > b ? a : b);
    }
}
