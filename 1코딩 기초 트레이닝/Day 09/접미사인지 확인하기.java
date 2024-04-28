import java.util.Arrays;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int length = my_string.length();
        int answer = 0;
        String[] ark = new String[length];
        
        for (int i = 0; i < length; i++){
            ark[i] = my_string.substring(i);
            if(is_suffix.equals(my_string.substring(i))) {
                answer = 1;
                break;
            }
        }

        
        return answer;
    }
}