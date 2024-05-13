class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        //5
        answer += hp / 5;
        
        //3
        answer += (hp % 5) / 3;
        
        //1
        answer += ((hp % 5) % 3) / 1;
        
        return answer;
    }
}