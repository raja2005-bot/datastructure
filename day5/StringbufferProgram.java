package day5;

public class StringbufferProgram {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("");
        System.out.println("Capacity"+sb.capacity());
        System.out.println(System.identityHashCode(sb));
        sb.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println("Capacity"+sb.capacity());
        System.out.println(System.identityHashCode(sb));



























        // capacity of stringBuffer
        // System.out.println(System.identityHashCode(sb));
        // sb.append("a");
        // System.out.println(System.identityHashCode(sb));
        // System.out.println(sb);
        // sb.append("b");
        // System.out.println(sb);
        // System.out.println(System.identityHashCode(sb));




    }
}
