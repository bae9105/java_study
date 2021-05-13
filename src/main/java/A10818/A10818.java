package A10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
public class A10818 {
    public static void main(String[] main) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] b = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<a;i++){
            b[i] = Integer.parseInt(st.nextToken());
        }
        int max =b[0], min=b[0];
        for(int i : b){
            if(i> max){
                max = i;
            }else if(i<min){
                min = i;
            }
        }
        System.out.print(min+ " " + max);
    }
}
*/

public class A10818 {
    public static void main(String[] main) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max =Integer.parseInt(st.nextToken()), min=max;
        for(int i=1;i<a;i++){
            int input = Integer.parseInt(st.nextToken());
            if(input> max){
                max = input;
            }else if(input<min){
                min = input;
            }
        }
        System.out.print(min+ " " + max);
    }
}
