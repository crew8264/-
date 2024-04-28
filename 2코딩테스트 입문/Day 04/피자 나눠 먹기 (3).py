def solution(slice, n):
    mid = choiso(slice, n)
    print(mid)
    answer = pizza(slice, mid)
    return answer

#피자 판수 계산 함수
def pizza(slice, n):
    pan = n//slice
    if(n % slice != 0):
        pan+=1;
    return pan

#최소 피자 조각 계산 함수
def choiso(slice, n):
    for i in range(2, n*100):
        if (i//n>0):
            return i
    return n