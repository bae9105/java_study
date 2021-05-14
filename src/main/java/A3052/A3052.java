package A3052;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*public class A3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] inBox = new int[10];
        int cnt = 0;
        for(int i = 0;i<10;i++){
            inBox[i] = sc.nextInt()%42;
        }
        for(int i = 0;i<42;i++){
            for(int j :inBox){
                if(i==j){
                    cnt +=1;
                    break;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}*/
//hashset을 이용하면 더 간단하게 구현가능

public class A3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<10;i++){
            set.add(sc.nextInt()%42);
        }
        System.out.println(set.size());
        sc.close();
    }
}
