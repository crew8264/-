import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int ctr[] = new int[31];
        
        for (String i : strArr) {
            ctr[i.length()]++;
        }
        
        Arrays.sort(ctr);
        
        return ctr[ctr.length-1];
    }
}