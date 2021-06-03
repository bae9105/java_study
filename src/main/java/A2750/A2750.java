package A2750;

import java.util.ArrayList;
import java.util.Scanner;

public class A2750 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int cnt = sc.nextInt();
        ArrayList<Integer> box = new ArrayList<>(cnt);
        for(int i = 0;i<cnt;i++){
            int input = sc.nextInt();
            box.add(input);
        }
        for(int i = 0;i<cnt;i++){
            int minval = box.get(0);
            int minidx = 0;
            for(int j = 1;j<box.size();j++){
                if(box.get(j)<minval){
                    minval = box.get(j);
                    minidx = j;
                }
            }
            box.remove(minidx);
            sb.append(minval+"\n");
        }
        System.out.println(sb);
    }
}
