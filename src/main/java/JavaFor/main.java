package JavaFor;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        for(int i = 1; i<10; i++){
            for(int j = 1; j<10; j++){
                System.out.println(i+" * "+j+" = "+i*j);
            }
        }
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; a<10; a++){
            System.out.println(a + " * " + i + " = " + a*i);
        }
        sc.close();
        System.out.println("=============");

        for(int i = 1; i<a; i++){
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }
}
