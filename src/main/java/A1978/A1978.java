/*
package A1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int priCnt=0;
        for(int i = 0;i<cnt;i++){
            int priNum=0;
            int input = Integer.parseInt(st.nextToken());
            for(int j = 1;j<=input;j++){
                if(input%j==0){
                    priNum++;
                }
            }
            if(priNum==2){
                priCnt++;
            }
        }
        System.out.println(priCnt);
    }
}
*/

package A1978;

import java.util.Scanner;

public class A1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int priCnt=0;
        for(int i = 0;i<cnt;i++){
            int priNum=0;
            int input = sc.nextInt();
            for(int j = 1;j<=input;j++){
                if(input%j==0){
                    priNum++;
                }
            }
            if(priNum==2){
                priCnt++;
            }
        }
        System.out.println(priCnt);
        sc.close();
    }
}
