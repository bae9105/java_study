package A1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0;i<num;i++){
            boolean output = true;
            String input = br.readLine();
            for(int j=0;j<input.length();j++){
                boolean flag = true;
                for(int k=j;k< input.length();k++){
                    if(input.charAt(j)!=input.charAt(k)){
                        flag = false;
                    }else if(input.charAt(j)==input.charAt(k) && flag==false){
                        output = false;
                    }
                }
            }
            if(output == true){
                cnt ++;
            }

        }
        System.out.println(cnt);
    }
}
