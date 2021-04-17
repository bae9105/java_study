package JavaArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(null);
        list.add(1,10);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1)); //10

        System.out.println(list.contains(10)); // true
        System.out.println(list.indexOf(10)); // 1

        list.remove(1);
        System.out.println(list);
        list.clear();
        System.out.println(list);

    }
}
