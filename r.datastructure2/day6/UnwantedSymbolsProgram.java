package day6;

public class UnwantedSymbolsProgram {
    public static void main(String[] args) {
        String original = "ah#%shj*skh^";
        String Cleaned = "";
        char []ch = original.toCharArray();
        for(char c : ch){
            if(c>='a' && c<='z'){
                Cleaned = Cleaned + c;
            }
        }
        System.out.println(Cleaned);
    }
}
