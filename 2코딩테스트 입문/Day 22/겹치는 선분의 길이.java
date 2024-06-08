import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr2 = new int[200];
        
        for(int[] i : lines){
            for(int j = i[0]; j < i[1]; j++){
                // 그냥 값 2로 맞춰주려고.
                if(arr2[j+100] == 2)
                    continue;
                arr2[j+100]++;
            }
        }
        
        for(int i = 0; i < 200; i++){
            if(arr2[i] == 2){
                System.out.println(i);
                answer++;
            }
        }
        
        return answer;
    }
}