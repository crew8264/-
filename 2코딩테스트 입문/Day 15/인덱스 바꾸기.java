class Solution {
    public String solution(String my_string, int num1, int num2) {
         char[] answer = my_string.toCharArray();
        
        // 해당 위치의 문자 변경
        answer[num1] = my_string.charAt(num2);
        answer[num2] = my_string.charAt(num1);
        
        // CharArray[] to String
        String anwser = String.valueOf(answer);
        
        return anwser;
    }
}