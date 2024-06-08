class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        // 기약분수 구하기
        for(int i = a; i > 1; i--){
            if((a%i == 0)&(b%i == 0)){
                a /= i;
                b /= i;
                break;
            }
        }
        
        // 2, 5로만 나누어 지는지 체크
        while(b > 1){
            if(b%2==0)
                b /= 2;
            else if(b%5==0)
                b /= 5;
            else
                return 2;
        }
        return 1;
    }
}