import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int[] alpB = new int[26];
        int[] alpA = new int[26];
        
        for(int i = 0; i < before.length(); i++){
            alpB[(int)before.charAt(i) - 97]++;
            alpA[(int)after.charAt(i) - 97]++;
        }
        
        return (Arrays.equals(alpA, alpB))?1:0;
    }
}
