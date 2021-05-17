package A1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        input = input.toUpperCase();//대문자로 변경한다
        int max = 0;
        char output = '?';
        for(char i='A';i<='Z';i++){
            int cnt = 0;
            for(int j = 0;j<input.length();j++){
                if(i==input.charAt(j)){//입력받은 문자의 인덱스별로 비교한다
                    cnt++;
                }
            }
            if(cnt>max){
                max = cnt;
                output = i;
            }else if(cnt == max){
                output = '?';
            }
        }
        System.out.println(output);

/*        System.out.println("----------------");
        String apple;
        apple ="ABCD";
        System.out.println(apple.charAt(1));
        System.out.println((int)apple.charAt(1));
        System.out.println(apple.charAt(1)-'A');
        System.out.println(apple.charAt(1)-'0');*/
    }
}
