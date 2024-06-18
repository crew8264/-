import java.util.*;
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        char[] cA = A.toCharArray();
        char[] cB = B.toCharArray();
        
        //제자리로 돌아오는 횟수만큼 반복,
        for(int i = 0; i < A.length(); i++){
            if(Arrays.equals(cA, cB))
                break;
            
            // 실제 돌려주는 코드
            char tmp = cA[A.length()-1];
            for(int j = A.length()-1; j > 0; j--){
                cA[j] = cA[j-1];
            }
            cA[0] = tmp;
            answer++;
        }
        return (answer == A.length())?(-1):(answer);
    }
}
