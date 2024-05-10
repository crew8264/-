import math as mt

def solution(n):
    answer = 0
    
    for i in range(1, int(mt.sqrt(n))+1):
        if i*i == n:
            answer += 1
        elif n % i == 0:
            answer += 2
            
    return answer