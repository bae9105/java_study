package A2231;

import java.util.*;

public class A2231 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int output = 0;
        for(int i = 0;i<input ; i++){
            String si = Integer.toString(i);
            int sum = 0;
            for(int j = 0;j<si.length();j++){
                sum += si.charAt(j)-'0';
            }
            if((sum+i)==input){
                output = i;
                break;
            }
        }
        System.out.println(output);
    }
}
