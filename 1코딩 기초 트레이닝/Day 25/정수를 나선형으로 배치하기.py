# smart 하네요
def solution(n):
    if n == 1:
        return [[1]]
    
    answer = [[0] * n for i in range(n)]

    row = 0
    col = 0
    dir = 'ri'
    
    for i in range(n*n):
        answer[row][col] = i + 1
        if dir == 'ri':
            col += 1
            if col == n-1 or answer[row][col+1] != 0:
                dir = 'do'
        elif dir == 'do':
            row += 1
            if row == n-1 or answer[row+1][col] != 0:
                dir = 'le'
        elif dir == 'le':
            col -= 1
            if col == 0 or answer[row][col-1] != 0:
                dir = 'up'
        elif dir == 'up':
            row -= 1
            if row == col-1 or answer[row-1][col] != 0:
                dir = 'ri'
                
    return answer

                