package A4673;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class A4673 {
    public static void main(String[] args){
        int a = 1;
        Set<Integer> num = new TreeSet<>();//중복없이 순서대로 저장되는 트리셋을 이용한다

        while(a<10001){
            int to = d(a);
            if(to < 10001){
                num.add(to);//트리셋에 저장한다
            }
            a++;
        }
        Iterator<Integer> it = num.iterator();
        int bb = 1;
        while(it.hasNext()){//데이터가 있을 때까지 반복한다
            int cc = it.next();
            for(int i = bb; i<cc;i++){
                System.out.println(i);
            }
            bb = cc+1;//생성자가 있는 숫자를 넘기 위해 +1한다
        }
    }
    public static int d(int a){
        String[] spl = Integer.toString(a).split(""); //각 자리수 분리한다
        int sum=0;
        for(int i = 0;i<spl.length;i++){
            sum += Integer.parseInt(spl[i]); //각 자리수 더한다
        }
        int totSum = a+sum;//원래 값에 각 자리수를 더한 값을 더 한다

        return totSum;
    }
}
/*

package A4673;

public class A4673{
    public static void main(String[] args){
        boolean[] chk = new boolean[10001];//논리 자료형 배열을 만든다
        for(int i = 0;i< 10001;i++){
            int dNum = d(i);
            if(dNum<10001){
                chk[dNum] = true;//나온 값의 위치에 true를 넣는다
            }
        }
        for(int i = 0;i<10001;i++){
            if(chk[i] != true){
                System.out.println(i);//false일 경우 출력한다
            }
        }

    }
    public static int d(int a){
        int num = a ; //초기값으로 입력값을 넣는다
        while(a>0){
            int b = a%10;//마지막 자리수를 구하기 위해 나머지를 이용한다
            num +=b;// 마지막 자리수를 더한다
            a = a/10;//한개의 자리수를 줄인다
        }

        return num;
    }
}*/
