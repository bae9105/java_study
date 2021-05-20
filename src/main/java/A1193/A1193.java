package A1193;

import java.util.Scanner;

public class A1193 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int seq=0 ,sum = 0;
        int wi,a,b;
        while(input > sum){
            seq ++;
            sum +=seq;
        }
        wi = sum - input;
        if(seq%2==0){
            a=seq;
            b=1;
            for(int i =0;i<wi;i++){
                a -=1;
                b +=1;
            }
        }else{
            a=1;
            b=seq;
            for(int j = 0;j<wi;j++){
                a +=1;
                b -=1;
            }
        }
        System.out.println(a+"/"+b);
        sc.close();
    }
}
