/*
package A10757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        int up = 0;
        String sumNum ="";
        int lenA = a.length()-b.length();
        int lenB = b.length()-a.length();
        if(a.length()>b.length()){
            for(int i = 0;i<lenA;i++){
                b = "0"+b;
            }
        }else{
            for(int i = 0;i<lenB;i++){
                a = "0"+a;
            }
        }
        for(int i =0;i<a.length();i++){
            int sum = a.charAt(a.length()-1-i)-'0'+b.charAt(b.length()-1-i)-'0'+up;
            if(sum>=10){
                up = 1;
            }else{
                up = 0;
            }
            sumNum = sum%10+sumNum;
            if(i==a.length()-1 && sum >=10){
                sumNum = "1"+sumNum;
            }
        }
        System.out.println(sumNum);
    }
}
*/
package A10757;

import java.math.BigInteger;
import java.util.Scanner;

public class A10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.add(b));
        sc.close();
    }
}
