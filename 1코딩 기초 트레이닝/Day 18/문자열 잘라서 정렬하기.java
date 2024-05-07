import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] deps = myString.split("x");
        Arrays.sort(deps);
        
        ArrayList<String> answer = new ArrayList<>();
        for (String str : deps) {
            if(!str.isEmpty())
                answer.add(str);
        }
        
        return answer.toArray(new String[0]);
    }
}
