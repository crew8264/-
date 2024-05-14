def solution(arr, k):
    if (k % 2) != 0:
        for i in range(len(arr)):
            arr[i] *= k
    else:
        for i in range(len(arr)):
            arr[i] += k
    return arr

''' iterable 숙지.
def solution(arr, k):

    if k%2==0:
        return [a+k for a in arr]
    else: 
        return [a*k for a in arr] 
'''