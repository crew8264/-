def solution(n):
    answer = pizza(n)
    return answer

# 피자 판수 계산 함수
def pizza(n):
    pan = n//7
    if(n % 7 != 0):
        pan+=1;
    return pan