package A2581;

import java.util.Scanner;

public class A2581 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int sum = 0;
        int minNum = max;
        for(int i = min;i<=max;i++){
            int priNum=0;
            for(int j = 1;j<=i;j++){
                if(i%j==0){
                    priNum++;
                }
            }
            if(priNum==2){
                sum += i;
                if(i<minNum){
                    minNum = i;
                }
            }
        }
        if(sum==0){
            System.out.println("-1");
        }else{
            System.out.println(sum);
            System.out.println(minNum);
        }
    }
}
