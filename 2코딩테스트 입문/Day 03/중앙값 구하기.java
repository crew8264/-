import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0, len = 0;
        Arrays.sort(array);
        System.out.println(array);
        return array[array.length/2];
    }
}