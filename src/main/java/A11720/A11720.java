/*
package A11720;

import java.util.Scanner;

public class A11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sumNum = 0;
        int cnt = sc.nextInt();
        String[] num = sc.next().split("");// 위에 nextInt()에서 '\n'이 남으므로 nextline()를 사용하면 안된다
        for(int i = 0;i<num.length;i++){
            sumNum += Integer.parseInt(num[i]);
        }
        System.out.println(sumNum);
        sc.close();
    }
}
*/

package A11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int sumNum = 0;
        String num = br.readLine();
        for(int i = 0;i<cnt; i++){
            sumNum += num.charAt(i)-'0';
        }
        System.out.println(sumNum);
    }
}
