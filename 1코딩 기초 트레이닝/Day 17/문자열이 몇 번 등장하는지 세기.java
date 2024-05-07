class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for (int i = 0; i < myString.length()+1; i++) {
            if (myString.substring(0, i).endsWith(pat) == true)
                answer++;
            //System.out.println(myString.substring(0, i));
        }
        return answer;
    }
}