package dsa;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String str = "babcba";
        int n = str.length();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            //process even
            int start = i,end = i;
            while(start>0 && end<n && str.charAt(start)==str.charAt(end)){
                start--;end++;
            }
            String temp = str.substring(start++,end--);
            if(temp.length()>result.length()){
                result = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int start = i,end = i+1;
            while(start>0 && end<n && str.charAt(start) == str.charAt(end)){
                start--;end++;
            }
            String temp = str.substring(start+1,end);
            if(temp.length()>result.length()){
                result = temp;
            }
        }

        System.out.println(result);
    }


}
