import math
def solution(numlist, n):
    answer = []
    gap = 0
    
    numlist.sort()
    while(gap<10001):
        for i in numlist[::-1]:
            if gap == (i-n):
                answer.append(i)
            elif gap == (n-i):
                answer.append(i)
        gap+=1
        

    return answer
