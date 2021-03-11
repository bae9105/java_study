package JavaArray;

public class Main {
    public static void main(String args[]){
        int a[] = new int[12];
        int b;
        for(int i=0;i< a.length;i++){
            b = (int)(Math.random()*10);
            a[i] = b;
            System.out.println(a[i]);
        }
    }
}
