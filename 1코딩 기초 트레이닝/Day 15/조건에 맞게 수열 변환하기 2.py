def solution(arr):
    answer = 0
    k = 0
    n1 = arr
    n2 = soo(n1)
    
    while(n1 != n2) :
        k += 1
        n1 = n2
        n2 = soo(n1)
        
            
    return k


def soo(arr) :
    answer = []
    for i in arr :
        if (i >= 50) and (i % 2 == 0) :
            answer.append(i / 2)
        elif (i < 50) and (i %2 == 1) :
            answer.append(i * 2 + 1)
        else :
            answer.append(i)
    return answer