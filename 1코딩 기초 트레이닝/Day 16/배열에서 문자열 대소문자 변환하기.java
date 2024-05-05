class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int k = 0;
        
        for (int i = 0; i < strArr.length; i++) {
            if(i % 2 == 0)
                answer[k++] = strArr[i].toLowerCase();
            else
                answer[k++] = strArr[i].toUpperCase();
        }
        return answer;
    }
}