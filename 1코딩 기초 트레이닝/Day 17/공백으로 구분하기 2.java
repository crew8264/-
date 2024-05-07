class Solution {
    public String[] solution(String my_string) {
        // trim : 공백 제거
        // \\s : 정규표현식   + : 여러 개
        String[] answer = my_string.trim().split("\\s+");
        return answer;
    }
}