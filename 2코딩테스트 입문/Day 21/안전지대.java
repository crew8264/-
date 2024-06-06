class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                // i,j 가 지뢰라면,
                if(board[i][j] == 1) {
                    int dx = i-1, dy = j-1;
                    // (i-1)~(i+1), (j-1)~(j+1) 까지,
                    for(int k = dx; k < dx+3; k++){
                        for(int n = dy; n < dy+3; n++){
                            // 좌표가 (0,0)~(max, max) 사이에서만.
                            if(((k >= 0)&(n >= 0)) & ((k < board.length)&(n < board.length))){
                                if(board[k][n] != 1)
                                    board[k][n] = 2;
                            }
                        }
                    }
                }
            }
        }
        
        // 0 개수 세기, 지도 확인.
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                System.out.printf("%d", board[i][j]);
                if(board[i][j] == 0)
                    answer+=1;
            }
            System.out.printf("\n");
        }
        
        return answer;
    }
}