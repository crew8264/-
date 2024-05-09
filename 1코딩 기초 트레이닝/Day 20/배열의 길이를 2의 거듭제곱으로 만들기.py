def solution(arr):
    for i in range(times(len(arr))-len(arr)):
        arr.append(0)
    
    return arr


def times(a):
    k = 1
    while k < a:
        k *= 2
        
    print(k)
    return k