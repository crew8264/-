class Solution {
    public int solution(int[][] dots) {
        // 0:1, 2:3의 경우, Y/X(기울기)
        double slope1 = (double)(dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]);
        double slope2 = (double)(dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]);
        System.out.printf("%f, %f\n", slope1, slope2);
        if(slope1 == slope2) return 1;
        // 0:2, 1:3의 경우,
        slope1 = (double)(dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]);
        slope2 = (double)(dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);
        System.out.printf("%f, %f\n", slope1, slope2);
        if(slope1 == slope2) return 1;

        // 0:3, 1:2의 경우,
        slope1 = (double)(dots[0][1] - dots[3][1]) / (dots[0][0] - dots[3][0]);
        slope2 = (double)(dots[2][1] - dots[1][1]) / (dots[2][0] - dots[1][0]);
        System.out.printf("%f, %f\n", slope1, slope2);
        if(slope1 == slope2) return 1;
 
        return 0;
    }
}