import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<String>();
        int idx = 0;
        
        for (int i = 0; i < strArr.length; i++) {
            // substring 떄문에 트리거 사용.
            boolean trig = false;
            // substring 해서 ad로 끝나는 단어 확인
            for (int j = 0; j < strArr[i].length()+1; j++) {
                if(strArr[i].substring(0, j).endsWith("ad")) {
                    trig = true;
                    break;
                }
            }
            
            // 트리거가 false 라면 배열 복사
            if(trig == false) {
                answer.add(strArr[i]);
            }
        }
        return answer.toArray(new String[0]);
    }
}


/* 탐나는 코드
import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> al = new ArrayList<>();

        for (String s : strArr) {
            if (!s.contains("ad")) {
                al.add(s);
            }
        }
        return al.toArray(String[]::new);
    }
}
*/