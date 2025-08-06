package day5;

public class leetcodeProblem {
    public static void main(String[] args) {
        // String needle = "leeto";
        // String haystack = "leetcode";
        // System.out.println(haystack.indexOf(needle));
        // to find whether the substring present in the string from the other stringor not.....
         String needle = "leet";
        String haystack = "leetcode";
        int count = 0;
        // System.out.println(needle.lastIndexOf(haystack));
        // System.out.println(haystack.substring(0,3));
        
        // for(int i=0; i<haystack.length()+needle.length(); i++){
        //     System.out.println(haystack.substring(i,(needle.length())+i));
        // }
        for(int i = 0; (i+needle.length())<=(haystack.length()); i++){
            String substr = haystack.substring(i, i+needle.length());
            if(substr.equals(needle)){
                count++;
            }

        }
        System.out.println(count);
    }
}
