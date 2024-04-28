class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int[] chk = new int[1000];

        for(int i = 0; i < array.length; i++)
            chk[array[i]]++;

        int max = -1, many = -1;
        for(int i = 0; i < 1000; i++) {
            if(many < chk[i]) {
                max = i;
                many = chk[i];
                System.out.printf("%d %d\n",max, many);
            }
        }
        
        int cnt = 0;
        for(int i = 0; i < 1000; i++) {
            if(many == chk[i]) {
                cnt++;
            }
        }
        System.out.println(many);
        if(cnt > 1)
            return -1;
        else
            return max;
    }
}