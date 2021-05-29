/*package A11047;

import java.io.*;
import java.util.StringTokenizer;

public class A11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] money = new int[n];
        int cnt = 0;
        for(int i = 0;i<n;i++){
            money[i] = Integer.parseInt(br.readLine());
        }
        for(int i = n-1;i>=0;i--){
            while(money[i]<=k){
                k = k-money[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}*/
package A11047;

import java.io.*;
import java.util.StringTokenizer;

public class A11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] money = new int[n];
        int cnt = 0;
        for(int i = 0;i<n;i++){
            money[i] = Integer.parseInt(br.readLine());
        }
        for(int i = n-1;i>=0;i--){
            if(money[i]<=k){
                cnt =cnt + k/money[i];
                k =k%money[i];
            }
        }
        System.out.println(cnt);
    }
}
