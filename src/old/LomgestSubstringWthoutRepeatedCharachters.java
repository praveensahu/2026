package old;

import java.util.HashSet;
import java.util.Set;

public class LomgestSubstringWthoutRepeatedCharachters {

    public static void main(String[] args) {
        String str = "pwwkew";
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        int startIndex = 0;
        for(int i =0;i<str.length();i++){
            char curr = str.charAt(i);
            while(set.contains(curr)){
                set.remove(curr);
                left++;
            }
            set.add(curr);

            if(left - i +1 >maxLength){
                maxLength = i-left+1;
                startIndex = left;
            }
        }

        System.out.println(set.size());
    }
}
