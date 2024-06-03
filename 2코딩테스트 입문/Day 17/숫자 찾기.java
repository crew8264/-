import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>(7);
        while(num > 0) {
            arr.add(num%10);
            num /= 10;
        }
        Collections.reverse(arr);
        
        System.out.println(arr);
        System.out.printf("%d개 %d번째\n", arr.size(), arr.indexOf(k)+1);
        
        if (arr.contains(k))
            return arr.indexOf(k)+1;
        else
            return -1;
    }
}