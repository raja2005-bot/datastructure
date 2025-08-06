package day5;

public class StringRev {
    public static void main(String[] args) {
        // String s = "abcdefgh";
        // String s1 = " ";
        // for(int i=s.length()-1;i>=0; i--){
        //     System.out.println(s.charAt(i));
        //     s1 = s1+s.charAt(i);
        // }
        // System.out.println(s1);
    
        String sb = "abcdef";
        StringBuffer sc= new StringBuffer();
        for(int i = sb.length()-1; i>0; i--){
            char ch = sb.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch == 'u') continue ;
                sc.append(ch);
            }
            System.out.println(sc);
        }
        

    }
