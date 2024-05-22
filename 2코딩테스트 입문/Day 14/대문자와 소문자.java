class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (char ch : my_string.toCharArray()) {
            if( ch >= 'a' && ch <= 'z' ) {
                // char에는 toUpperCase()를 사용할 수 없음
				String temp = ch + "";
				answer += temp.toUpperCase();
			} else if( ch >= 'A' && ch <= 'Z'){
				String temp = ch + "";
				answer += temp.toLowerCase();
			}
        }
        return answer;
    }
}