package JavaIf;

public class Main {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        if(a > b){
            System.out.println("a");
        }else if (a == b){
            System.out.println("a=b");
        }else{
            System.out.println("b");
        }

        int c = 10;
        int d = 10;
        if(c == d){
            System.out.println("c=d");
        }else {
            System.out.println("c!=d");
        }
        String e = "e";
        String f = "e";
        if (e==f){
            System.out.println("e=f");
        }else{
            System.out.println("e!=f");
        }
        boolean g = false;
        if(g){
            System.out.println("true");
        }
        boolean h = true;
        if(h){
            System.out.println("true");
        }
        String m = "AAA";
        String n = m;
        String o = new String("AAA");

        if(m == n){
            System.out.println("m=n");
        }else{
            System.out.println("m!=n");
        }
        if(n == o){
            System.out.println("n=o");
        }else{
            System.out.println("n!=o");
        }
        if(m == o){
            System.out.println("m==o");
        }else{
            System.out.println("m!=o");
        }

        if(m.equals(n)){
            System.out.println("m=n");
        }else{
            System.out.println("m!=n");
        }
        if(n.equals(o)){
            System.out.println("n=o");
        }else{
            System.out.println("n!=o");
        }
        if(m.equals(o)){
            System.out.println("m=o");
        }else{
            System.out.println("m!=o");
        }





    }
}
