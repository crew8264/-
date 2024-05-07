import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> answer = new ArrayList<String>();
        
        // 이전의 space 인덱스 저장
        int bidx = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            // i번째 요소가 space 라면,
            if(my_string.charAt(i) == ' ') {
                // 배열에 추가
                answer.add(my_string.substring(bidx, i));
                // space 한칸 빼주기.
                bidx = i+1;
            }
        }
        
        //어차피 마지막 요소는 space가 없고,
        //space가 아예 없는 경우도 코드가 겹침.
        answer.add(my_string.substring(bidx, my_string.length()));
        
        return answer.toArray(new String[0]);
    }
}

/* 무친 코드인듯

class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }
}
*/