package A2447;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class A2447 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = sc.nextInt();
        String[][] box = new String[input][input];
        for(int i = 0; i<input;i++){
            for(int j = 0; j<input;j++){
                box[i][j] = " ";
            }
        }
        star(box,0,0,input);
        for(String[] strings : box){
            for(String string : strings){
                bw.write(string+"");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        sc.close();
    }
    public static void star(String[][] arr, int a, int b, int n){
        if(n==1){
            arr[a][b] = "*";
            return;
        }
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                if(!(i==1 && j==1)){
                    star(arr,a+i*(n/3), b +j*(n/3),n/3);
                }
            }
        }

    }
}
