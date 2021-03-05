package JavaForEach;

public class main {
    public static void main(String[] args){
        int[] students = new int[10];
        for(int i =0; i<10;i++){
            students[i] =(int)(Math.random()*100);
        }
        for(int score : students){
            System.out.println(score);
        }

    }
}
