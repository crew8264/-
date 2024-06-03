import math

def solution(n):
    answer = math.sqrt(n)
    
    if float(int(answer)) == answer :
        return 1
    else:
        return 2