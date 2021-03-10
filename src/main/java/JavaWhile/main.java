package JavaWhile;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int a = 1;
        while(a <10){
            System.out.println(a);
            a++;
        }
        Scanner sc = new Scanner(System.in);
        int coin = 0;
        int cokeprice = 1000;
        while(coin < cokeprice){
            coin += sc.nextInt();
            System.out.println(coin+"원");
        }
        System.out.println("넣은 돈 : "+ coin);
        int lastprice = coin-cokeprice;
        System.out.println("잔돈 : "+ lastprice);

        sc.close();
    }
}
