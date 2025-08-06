package day6;

public class ToggleCase {
    public static void main(String[] args) {
        String original = "RaJaGanEsH";
        String Toggle = "";
        for(char ch : original.toCharArray()){
            if(ch >='A' && ch<='Z'){
                ch = (char)(ch+32);
            }
            else if(ch>='a' && ch<='z'){
                ch = (char)(ch-32);
            }
            Toggle = Toggle + ch;
        }
        System.out.println(Toggle);
    }
}
