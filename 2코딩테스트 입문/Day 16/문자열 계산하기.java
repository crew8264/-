class Solution {
    public int solution(String my_string) {
        String[] sick = my_string.split(" ");
        int answer = Integer.parseInt(sick[0]); // 처음은 sick[0]으로 시작
        
        // 미리 끊어둔 문자가 수식이라면,
        for(int i=0; i<sick.length; i++){
            switch(sick[i]){
                case "+":
                    answer += Integer.parseInt(sick[i+1]);
                    break;
                case "-":
                    answer -= Integer.parseInt(sick[i+1]);
                    break;
            }
        }
        return answer;
    }
}