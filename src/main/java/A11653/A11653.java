/*package A11653;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class A11653 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = sc.nextInt();
        while(input!=1){
            for(int j = 2;j<=input;j++){
                if(input%j==0){
                    input /= j;
                    bw.write(j+"\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
        sc.close();
    }
}*/

package A11653;

import java.util.Scanner;

public class A11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(),j = 2;
        while(input!=1){
            if(input%j==0){
                input /= j;
                System.out.println(j);
            }else j++;
        }
        sc.close();
    }
}