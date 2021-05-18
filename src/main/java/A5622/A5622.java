package A5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int sumTime = 0;
        for(int i = 0;i<input.length();i++){
            int a = input.charAt(i)-'A';
            if(a<15){
                sumTime +=((a/3)+3);
            }else if(a>=15 && a<19){
                sumTime += 8;
            }else if(a>=19 && a<22){
                sumTime += 9;
            }else{
                sumTime +=10;
            }
        }
        System.out.println(sumTime);
    }
}
