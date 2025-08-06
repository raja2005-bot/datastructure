package day6;


import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> ilist = new ArrayList<>();
        ilist.add(10);
        ilist.add(20);
        ilist.add(30);
        System.out.println(ilist);
        ArrayList<Character> clist = new ArrayList<>();
        clist.add('a');
        clist.add('b');
        clist.add('c');
        System.out.println(clist);
        ArrayList<Double> dlist = new ArrayList<>();
        dlist.add(1.3);
        dlist.add(1.2);
        dlist.add(4.3);
        System.out.println(dlist);
        System.out.println(ilist.contains(20));
        System.out.println(ilist.contains(30));
        ilist.add(0,8);
        System.out.println(ilist);
        // ArrayList<Long> llist = new ArrayList<>();
        // llist.add();
        // ArrayList<Short> slist = new ArrayList<>();

        // ArrayList<Float> flist = new ArrayList<>();
        ArrayList<Boolean> blist = new ArrayList<>();
        blist.add(true);
        blist.add(false);
        blist.add(true);
        blist.add(false);
        System.out.println(blist);
        // ArrayList<Byte> Blist = new ArrayList<>();
    }
}
