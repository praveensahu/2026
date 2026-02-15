package dsa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//time complexity O(m x n)
//space complexity O( m x n )
public class ALlLetterCobination {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        Set<String> o = new LinkedHashSet<>();
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                o.add(""+str1.charAt(i)+str2.charAt(j));
            }
        }
        System.out.println(o);
    }
}
