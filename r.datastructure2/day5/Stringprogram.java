package day5;

public class Stringprogram {
    public static void main(String[] args) {
        String s = "";
        System.out.println(System.identityHashCode(s));
        s = s+'a';
        System.out.println(s);
        System.out.println(System.identityHashCode(s));
        s = s+'b';
        System.out.println(s);
        System.out.println(System.identityHashCode(s));
    }
}
