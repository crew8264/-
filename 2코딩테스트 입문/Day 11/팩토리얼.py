def solution(n):
    lst = [0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800]
    
    for i in lst:
        if n == i:
            return lst.index(i)
        elif n < i:
            return lst.index(i)-1
        
    return 1
