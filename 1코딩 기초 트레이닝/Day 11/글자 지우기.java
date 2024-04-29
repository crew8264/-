import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        StringBuffer answer = new StringBuffer(my_string);
        
        for(int i = indices.length-1; i >= 0; i--) {
            answer.deleteCharAt(indices[i]);
        }
        
        return answer.toString();
    }
}