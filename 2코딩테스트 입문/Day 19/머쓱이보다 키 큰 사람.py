def solution(array, height):
    answer = 0
    for st in array:
        if(st > height):
            answer += 1
    return answer
