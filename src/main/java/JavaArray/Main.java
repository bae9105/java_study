package JavaArray;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int[] a = new int[12];
        int b;
        for(int i=0;i< a.length;i++){
            b = (int)(Math.random()*10);
            a[i] = b;
            System.out.println(a[i]);
        }

        int[] sixnum = new int[6];
        int num;
        for(int i=0;i<sixnum.length;i++){
            num = (int)(Math.random()*45+1);
            sixnum[i] = num;
        }
        for(int i : sixnum){
            System.out.println(i);
        }
        int[] d = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< d.length;i++){
            int e = sc.nextInt();
            d[i] = e;
        }
        for(int i : d){
            System.out.println(i);
        }
        sc.close();
    }
}
