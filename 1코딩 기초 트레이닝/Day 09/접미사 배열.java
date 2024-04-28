import java.util.Arrays;


class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] ark = new String[length];
        
        for (int i = 0; i < length; i++)
            ark[i] = my_string.substring(i);

        //사전순 정렬
        Arrays.sort(ark);
        return ark;
    }
}