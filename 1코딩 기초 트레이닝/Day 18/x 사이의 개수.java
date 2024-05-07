class Solution {
    public int[] solution(String myString) {
        // -1 꼭 봐두세요
        String[] deps = myString.split("x", -1);
        int[] answer = new int[deps.length];
        
        int i = 0;
        for (String asd : deps)
            answer[i++] = asd.length();
        
        return answer;
    }
}