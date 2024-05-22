def solution(array, n):
    answer = -100
    array.sort()
    for i in array:
        if abs(n - i) < abs(n - answer):
            answer = i
        elif abs(n - i) == abs(n - answer):
            continue
    return answer