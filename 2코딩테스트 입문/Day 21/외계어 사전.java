class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String st : dic){
            int ctx = spell.length;
            
            for(String alp : spell){
                if(st.contains(alp))
                    ctx--;
            
            if(ctx == 0){
                System.out.println(st);
                return 1;
            }
            }
        }
        return answer;
    }
}