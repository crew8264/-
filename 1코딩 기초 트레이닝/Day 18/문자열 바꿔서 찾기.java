class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String str1 = pat.replace("A", "*");
        str1 = str1.replace("B", "A");
        str1 = str1.replace("*", "B");
        System.out.println(str1);
        
        for (int i = 0; i < myString.length()+1; i++) {
            if(myString.substring(0, i).endsWith(str1))
                return 1;
        }
        
        return answer;
    }
}