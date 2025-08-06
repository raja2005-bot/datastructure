package day5;

public class lowerUpper {
    public static void main(String[] args) {
        String s = "Madam ";
        s = s.toLowerCase().trim();  //-> use to remove the space
        StringBuffer sb = new StringBuffer(s);
        String rev = sb.reverse().toString();
        System.out.println(rev);
        if(s.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a Palindrome");
        }   
    
    }
}
