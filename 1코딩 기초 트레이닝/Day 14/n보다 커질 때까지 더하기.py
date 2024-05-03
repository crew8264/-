def solution(numbers, n):
    sum = 0
    
    for j in numbers :
        if sum > n :
            break
        sum += j
        
    return sum