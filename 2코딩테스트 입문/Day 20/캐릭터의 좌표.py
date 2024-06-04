import math

def solution(keyinput, board):
    answer = [0, 0]
    
    for ips in keyinput:
        if (ips == "left") and ((answer[0]) != -(board[0]//2)):
            answer[0] -= 1
        if (ips == "right") and ((answer[0]) != (board[0]//2)):
            answer[0] += 1
        if (ips == "up") and ((answer[1]) != (board[1]//2)):
            answer[1] += 1
        if (ips == "down") and ((answer[1]) != -(board[1]//2)):
            answer[1] -= 1
            
        
            
    return answer
