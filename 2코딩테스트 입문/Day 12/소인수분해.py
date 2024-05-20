def solution(n):
    answer = []
    
    tmp = 2
    while(n > 1):
        if (n % tmp)!= 0:
            tmp += 1
            continue
        n = n // tmp
        answer.append(tmp)
        
    
    return sorted(list(set(answer)))