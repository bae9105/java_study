package A10809;

import java.util.Scanner;

public class A10809 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        for(int i =97;i<=122;i++){ //아스키 코드 숫자 기준 97 ~ 122
            char as = (char)i;
            System.out.print(input.indexOf(as)+" ");
        }
    }
}
