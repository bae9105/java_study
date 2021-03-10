package JavaForEach;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int[] students = new int[10];
        for(int i =0; i<10;i++){
            students[i] =(int)(Math.random()*100);
        }
        for(int score : students){
            System.out.println(score);
        }


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] point = new int[a];
        for(int i = 0; i <a; i++){
            int b = sc.nextInt();
            point[i] = b;
        }
        System.out.println(point);

        sc.close();


    }
}
