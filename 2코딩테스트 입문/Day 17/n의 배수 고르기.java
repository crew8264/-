import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int k : numlist) {
            if((k % n) == 0)
                arr.add(k);
        }
        int[] arr2 = arr.stream()
            .mapToInt(i -> i)
            .toArray();
        
        return arr2;
    }
}