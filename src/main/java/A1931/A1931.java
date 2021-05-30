/*package A1931;

import java.util.*;

public class A1931 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] time = new int[n][2];
        boolean[] chk1 = new boolean[n];
        Arrays.fill(chk1, false);
        for(int i = 0;i<n;i++){
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }
        int maxCnt = 0;
        int edTime = 0;
        for(int i = 0;i<n;i++){
            edTime = time[i][1];
            int cnt = 0;
            while(true){
                int chk2 = 0;
                int min = 0;
                int minJ=0;
                for(int j = 0;j<n;j++){
                    if(i!=j && chk1[j]==false && time[j][0]>=edTime){
                        if(chk2==0){
                            min = time[j][1];
                            minJ = j;
                            chk2++;
                        }
                        if(time[j][1]<min){
                            min = time[j][1];
                            minJ= j;
                        }
                    }
                }
                chk1[minJ] =true;
                edTime = time[minJ][1];
                cnt++;
                if(min==0){
                    break;
                }
            }
            if(cnt>maxCnt){
                maxCnt = cnt;
            }
        }
        System.out.println(maxCnt);
        sc.close();
    }
}*/

/*
package A1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] time = new int[n][2];
        boolean[] chk1 = new boolean[n];
        Arrays.fill(chk1, false);
        int min1 =0;
        int min2 =0;
        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
            if(i==0){
                min1 = time[i][1];
                min2 = i;
            }
            if(time[i][1]<min1){
                min1 = time[i][1];
                min2 = i;
            }
        }
        int edTime = 0;
        edTime = time[min2][1];
        chk1[min2] = true;
        int cnt = 0;
        while(true){
            int chk2 = 0;
            int min = 0;
            int minJ=0;
            for(int j = 0;j<n;j++){
                if(chk1[j]==true){
                    continue;
                }else{
                    if(time[j][0]>=edTime){
                        if(chk2==0){
                            min = time[j][1];
                            minJ = j;
                            chk2++;
                        }
                        if(time[j][1]<min){
                            min = time[j][1];
                            minJ= j;
                        }
                    }else{
                        chk1[j] = true;
                    }
                }
            }
            chk1[minJ] =true;
            edTime = time[minJ][1];
            cnt++;
            if(min==0){
                break;
            }
        }
        System.out.println(cnt);
    }
}
*/

//        Arrays.sort(time, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0]-o2[0];
//            }
//        });

//        Arrays.sort(time, Comparator.comparingInt(num1 -> num1[1]));

package A1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] time = new int[n][2];
        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][1] = Integer.parseInt(st.nextToken());
            time[i][0] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            }else{
                    return Integer.compare(o1[0],o2[0]);
                }
            } );

        int edMin = time[0][0];
        int cnt = 1;
        for(int i = 1;i<n;i++){
            if(time[i][1]>=edMin){
                edMin=time[i][0];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
