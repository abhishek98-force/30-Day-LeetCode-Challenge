import java.util.*;
class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> charStr = new HashMap<>();
        int a = 97;
        charStr.put(' ',' ');
        for(char ch : key.toCharArray()){
            if(!charStr.containsKey(ch)){
                charStr.put(ch, (char)a++);
                System.out.println(charStr);
            }
        }
        System.out.println(charStr);
        String s = "";
        for(char ch : message.toCharArray()){
            s = s + charStr.get(ch);
        }
        return s;
    }
}
    public static void main(String[] agrs){
        Solution c = new Solution();
        System.out.println(c.decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv"));
    }
}