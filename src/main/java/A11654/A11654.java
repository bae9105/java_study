/*package A11654;

import java.util.Scanner;

public class A11654 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char input = sc.nextLine().charAt(0); //nextLine : '\n'을 포함하는 한 라인을 읽고 '\n'을 버린 나머지만 리턴
        System.out.println((int)input);
        sc.close();
    }
}*/

package A11654;

import java.io.IOException;
import java.io.InputStream;

public class A11654 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;//콘솔입력을 받는다
        System.out.println(is.read());//.read : 1바이트를 입력을 확인한다
    }
}

