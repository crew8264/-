import java.util.*;
class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] deps = binomial.trim().split(" ");
        System.out.printf("%s %s", deps[0], deps[1]);
        
        int a = Integer.parseInt(deps[0]);
        int b = Integer.parseInt(deps[2]);
        
        switch(deps[1]) {
            case "+" :
                answer = a + b;
                break;
            case "-" :
                answer = a - b;
                break;
            case "*" :
                answer = a * b;
                break;
        }     
        
        return answer;
    }
}