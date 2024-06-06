class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        
        // CharArray에서 ch
        int idx = 0; int tmp = 0;
        for(int i = 0; i < arr.length; i++){
            char ch = arr[i];
            
            // 정수라면,
            if(((ch >= '0') & (ch <= '9'))){
                if (tmp != 0) {
                    tmp = tmp*10 + ch-48;
                } else { tmp = ch-48; }
            // 정수가 아니라면,
            } else { answer += tmp; tmp = 0; }
        }
        
        // 마지막 문자가 숫자인 경우, 강제로 더해.
        if(tmp != 0)
            answer += tmp;
        return answer;
    }
}