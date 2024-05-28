class Solution {
    public String solution(String s) {
        String answer = "";
        int[] alp = new int[26];
        
        // 알파벳의 해당 배열을 ++
        for(char ch : s.toCharArray()){
            alp[ch - 97]++;
        }
        
        // 배열에서 값이 1인 것만 ++
        for(int i = 0; i < 26; i++){
            if(alp[i] == 1)
                answer += (char)(i + 97);
        }
        return answer;
    }
}