/*package A2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] cro ={"c=","c-","dz=","d-","lj","nj","s=","z="};
        int cnt = 0;
        for(int i=0;i< cro.length;i++){
            while(input.indexOf(cro[i])!=-1){
                input = input.replaceFirst(cro[i]," ");
                cnt ++;
            }
        }
        input = input.replace(" ","");
        cnt += input.length();
        System.out.println(cnt);
    }
}*/

package A2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] cro ={"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(int i=0;i< cro.length;i++){
            input = input.replaceAll(cro[i],"1");
        }
        System.out.println(input.length());
    }
}