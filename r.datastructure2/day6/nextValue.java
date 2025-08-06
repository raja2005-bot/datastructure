package day6;

public class nextValue {
    public static void main(String[] args) {
        String s = "yz";
        // int ascii_sum = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int val = ch;
            val = (ch=='z')?'a':val+1;
            char ch1 = (char)val;
            System.out.println(val + "-"+ch1);
        }
        // System.out.println(val);
    }
}
