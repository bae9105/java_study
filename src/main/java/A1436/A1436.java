/*package A1436;

import java.util.*;

public class A1436 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int ord = 0;
        int output = 0;
        int seq = 666;
        while(input != ord){
            String iStr = Integer.toString(seq);
            for(int j = 0;j<=iStr.length()-3;j++){
                if(iStr.substring(j,j+3).equals("666")){
                    ord++;
                    break;
                }
            }
            if(ord==input){
                output = seq;
                break;
            }
            seq++;
        }
        System.out.println(output);
        sc.close();
    }
}*/

package A1436;

import java.util.*;

public class A1436 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int ord = 0;
        int seq = 666;
        while(input != ord){
            String iStr = Integer.toString(seq);
            if(iStr.contains("666")){
                ord++;
            }
            if(ord==input){
                break;
            }
            seq++;
        }
        System.out.println(seq);
        sc.close();
    }
}
