import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> answer = new ArrayList<String>();
        
        // n글자씩 저장할 tmp, 몇 번째 글자까지 했는제 확인하는 len.
        String tmp = "";
        int len = 0;
        
        for (char ch : my_str.toCharArray()){
            tmp += Character.toString(ch);
            len++;
            
            // n글자씩이거나, 마지막 문자라면,
            if((tmp.length() == n)|(len == (my_str.length()))) {
                answer.add(tmp);
                tmp = "";
            }
        }
        
        //ArrayList to String[]
        return answer.toArray(new String[0]);
    }
}
