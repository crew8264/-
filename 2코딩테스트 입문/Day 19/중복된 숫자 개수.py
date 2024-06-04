def solution(array, n):
    answer = 0
    for st in array:
        if st == n:
            answer += 1
            
    return answer
