def solution(n):
    answer = pizza(choiso(n))
    return answer

#피자 판수 계산 함수
def pizza(n):
    pan = n//6
    if(n % 6 != 0):
        pan+=1;
    return pan

#최소 피자 조각 계산 함수
def choiso(n):
    for i in range(2, n*100):
        if (i%6==0) and (i%n==0):
            return i
    return n