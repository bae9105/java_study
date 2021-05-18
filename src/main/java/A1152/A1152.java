/*
package A1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();
        if(input.length() == 0){
            System.out.println("0");
        }else{
            String[] chk = input.split(" ");
            System.out.println(chk.length);
        }
    }
}
*/

package A1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt =0;
        while(st.hasMoreTokens()){
            st.nextToken();
            cnt++;
        }
        System.out.println(cnt);
    }
}
