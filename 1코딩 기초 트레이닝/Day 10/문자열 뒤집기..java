class Solution {
    public String solution(String my_string, int s, int e) {
        char[] answer = my_string.toCharArray();
        for(int i = 0; s<e; i++) {
            char tmp = answer[e];
            answer[e] = answer[s];
            answer[s] = tmp;
            
            s++; e--;
        }
        return new String(answer);
    }
}